package org.jsp.shoppingkart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    
    @GetMapping("/login")
    public String loadLogin()
    {
        return "CustomerLogin";
    }
    @GetMapping("/signup")
    public String loadSignup()
    {
        return "CustomerSignup";
    }
}
