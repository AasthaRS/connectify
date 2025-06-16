package com.aasthagupta.connectify.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class PageController {
    
    // @RequestMapping("/home")
    // public String home() {
    //     System.out.println("Home page handled");
    //     return "home";
    // }

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home page handled");
        model.addAttribute("name", "Substring Technologies");
        model.addAttribute("description", "My first springboot project");
        model.addAttribute("portfolio", "https://github.com/AasthaRS/");
        return "home";
    }
    
    
}
