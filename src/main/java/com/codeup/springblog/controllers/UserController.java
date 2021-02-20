package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

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
    @RequestMapping("/{userId}/items")
    public List<String>displayStringJson() {
        return Arrays.asList("Johnny Was", "Tommy Bahama", "Sundance");
    }
//    How to build a restful api
//    @RequestMapping("/{userId}/products_as_json")
//    public List<Product> displayProductJson() {
//        return (List<Product>) Arrays.asList
//                (new Product (1,"Johnny Was", 54.99),
//                        new Product (2,"Johnny Was", 94.99),
//                        new Product (3,"Johnny Was", 74.99));
//
//    }
    @RequestMapping("/{userId}/products_as_json")
    public Product displayProductJson() {
        return new Product (5,"Johnny Was", 54.99);


    }
}
