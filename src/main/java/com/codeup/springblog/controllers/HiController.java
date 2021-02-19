package com.codeup.springblog.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    @RequestMapping(value ="/hi", method = RequestMethod.GET)
    public String sayHello(){
        return "<h1>hello you!</h1>";
    }
}
