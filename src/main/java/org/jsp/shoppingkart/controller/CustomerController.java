package org.jsp.shoppingkart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    
    @GetMapping("/customer/login")
    public String loadLogin()
    {
        return "CustomerLogin";
    }
}
