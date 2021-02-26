package com.codeup.springblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/")
    @ResponseBody
    public String message(){
        return "This is the landing page! Welcome home!";
    }
    @GetMapping("/login")
    public String showLoginForm(){
        return "login";

    }
}

