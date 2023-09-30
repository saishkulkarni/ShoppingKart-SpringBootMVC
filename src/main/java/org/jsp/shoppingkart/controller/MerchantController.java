package org.jsp.shoppingkart.controller;

import org.jsp.shoppingkart.dto.Merchant;
import org.jsp.shoppingkart.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/merchant")
public class MerchantController {
    @Autowired
    MerchantService merchantService;

    @GetMapping("/login")
    public String loadLogin() {
        return "MerchantLogin";
    }

    @GetMapping("/signup")
    public String loadSignup() {
        return "MerchantSignup";
    }

    @PostMapping("/signup")
    public String signup(Merchant merchant,ModelMap map) {
        return merchantService.signup(merchant,map);
    }
}
