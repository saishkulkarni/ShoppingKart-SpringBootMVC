package org.jsp.shoppingkart.service;

import java.util.Random;

import org.jsp.shoppingkart.dao.MerchantDao;
import org.jsp.shoppingkart.dto.LoginHelper;
import org.jsp.shoppingkart.dto.Merchant;
import org.jsp.shoppingkart.helper.AES;
import org.jsp.shoppingkart.helper.SendEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import jakarta.servlet.http.HttpSession;

@Service
public class MerchantService {

    @Autowired
    MerchantDao merchantDao;

    @Autowired
    SendEmail sendEmail;

    public String signup(Merchant merchant, ModelMap map) {
        Merchant merchant1 = merchantDao.fetchByEmail(merchant.getEmail());
        Merchant merchant2 = merchantDao.fetchByMobile(merchant.getMobile());
        if (merchant1 != null) {
            map.put("fail", "Email Already Exists");
            return "MerchantSignup";
        }
        if (merchant2 != null) {
            map.put("fail", "Mobile Number Already Exists");
            return "MerchantSignup";
        }
        merchant.setPassword(AES.encrypt(merchant.getPassword(), "123"));
        int otp = new Random().nextInt(100000, 999999);
        merchant.setOtp(otp);
        sendEmail.sendEmail(merchant);
        merchantDao.save(merchant);
        map.put("pass", "OTP Sent Successfully");
        map.put("id", merchant.getId());
        return "MerchantVerifyOtp";
    }

    public String verify(int id, int otp, ModelMap map) {
        Merchant merchant = merchantDao.fetchById(id);
        if (merchant == null) {
            map.put("fail", "Something Went Wrong");
            return "Home";
        } else {
            if (merchant.getOtp() == otp) {
                merchant.setVerified(true);
                merchantDao.save(merchant);
                map.put("pass", "OTP Verified Successfully");
                return "MerchantLogin";
            } else {
                map.put("fail", "Invalid OTP");
                map.put("id", merchant.getId());
                return "MerchantVerifyOtp";
            }
        }
    }

    public String login(LoginHelper helper, ModelMap map, HttpSession session) {
        Merchant merchant = merchantDao.fetchByEmail(helper.getEmail());
        if (merchant == null) {
            map.put("fail", "Invalid Email");
            return "MerchantLogin";
        } else {
            if (AES.decrypt(merchant.getPassword(), "123").equals(helper.getPassword())) {
                if(merchant.isVerified())
                {
                    session.setAttribute("merchant", merchant);
                    map.put("pass", "Login Successfully");
                    return "MerchantHome";
                }
                else{
                    map.put("fail", "Account Not Verified, Verify First");
                    sendEmail.sendEmail(merchant);
                    map.put("id", merchant.getId());
                    return "MerchantVerifyOtp";
                }
            }
            else{
                map.put("fail", "Invalid Password");
                return "MerchantLogin";
            }
        }
    }

}