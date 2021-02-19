package com.codeup.springblog.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HiController {
//    Don't need the get request or the value because it's default
//    @RequestMapping(value ="/basic", method = RequestMethod.GET)
    @RequestMapping("/basic")
    public String sayHello(){
        return "<h1>hello you!</h1>";
    }
    @RequestMapping(value ="/proper", method = RequestMethod.GET)
    public String sayProperHello(){
        return "<h1>Good day! May I ask how you're doing today?</h1>";
    }
    @RequestMapping("/user_entry")
    public String userForm() {
        return "<form action=\"/user_greeting\" method=\"Post\">\n" +
                "  <label for=\"fname\">First name:</label><br>\n" +
                "  <input type=\"text\" id=\"fname\" name=\"fname\" value=\"write your name here\"><br>\n" +
                "  <label for=\"lname\">Last name:</label><br>\n" +
                "  <input type=\"text\" id=\"lname\" name=\"lname\" value=\"write your last name here\"><br><br>\n" +
                "  <input type=\"submit\" value=\"Submit\">\n" +
                "</form> ";
    }

}
