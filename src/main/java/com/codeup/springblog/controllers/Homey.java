package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homey {
    @RequestMapping("/index")
    public String home(){
        return "pages/index";

    }
}
