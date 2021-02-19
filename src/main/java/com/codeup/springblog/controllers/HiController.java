package com.codeup.springblog.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HiController {
    @RequestMapping(value ="/basic", method = RequestMethod.GET)
    public String sayHello(){
        return "<h1>hello you!</h1>";
    }
    @RequestMapping(value ="/proper", method = RequestMethod.GET)
    public String sayProperHello(){
        return "<h1>Good day! May I ask how you're doing today?</h1>";
    }
}
