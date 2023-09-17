package org.jsp.shoppingkart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/merchant")
public class MerchantController {
    @GetMapping("/login")
    public String loadLogin() {
        return "MerchantLogin";
    }

    @GetMapping("/signup")
    public String loadSignup() {
        return "MerchantSignup";
    }
}
