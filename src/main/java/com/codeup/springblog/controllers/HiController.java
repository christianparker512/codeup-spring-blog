package com.codeup.springblog.controllers;

import org.apache.coyote.Request;
import org.springframework.web.bind.annotation.*;

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
        return "<form action=\"/greeting/user_greeting\" method=\"Post\">\n" +
                "  <label for=\"fname\">First name:</label><br>\n" +
                "  <input type=\"text\" id=\"fname\" name=\"fname\" value=\"write your name here\"><br>\n" +
                "  <label for=\"lname\">Last name:</label><br>\n" +
                "  <input type=\"text\" id=\"lname\" name=\"lname\" value=\"write your last name here\"><br><br>\n" +
                "  <input type=\"submit\" value=\"Submit\">\n" +
                "</form> ";
    }
    @RequestMapping(value="/user_greeting", method = RequestMethod.POST)

    public String printUserGreeting(@RequestParam String fname, @RequestParam String lname){
        return "Hello there, " + fname + " " +  lname ;
    }
    @RequestMapping(value="/orders/{id}", method=RequestMethod.GET)
    public String getOrder(@PathVariable String id){
        return "Order ID: " + id;

    }

}