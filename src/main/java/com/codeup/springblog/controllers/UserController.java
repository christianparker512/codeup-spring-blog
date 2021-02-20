package com.codeup.springblog.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/{userId}")
    public String displayUser(@PathVariable int userId){
        return "User found :" + userId;

    }
    @RequestMapping("/{userId}/invoices")
    public String displayUserInvoices(@PathVariable int userId, @RequestParam (value="d", required=false) Date dateOrNull){
        return "invoice found for user:" + userId + " on the date: " + dateOrNull;

    }
}
