package org.jsp.shoppingkart.helper;

import org.jsp.shoppingkart.dto.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class SendEmail {

    @Autowired
    JavaMailSender mailSender;

    public void sendEmail(Merchant merchant) {
        MimeMessage mimeMessage=mailSender.createMimeMessage();
        MimeMessageHelper helper=new MimeMessageHelper(mimeMessage);

        try {
            helper.setTo(merchant.getEmail());
            helper.setSubject("OTP Verification");
            String text="<h1> Hello "+merchant.getName()+"</h1><h2>Your OTP is "+merchant.getOtp()+"</h2>";
            helper.setText(text, true);
            mailSender.send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }
}
