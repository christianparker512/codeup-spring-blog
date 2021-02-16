package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @GetMapping("/add/{number1}/and/{number2}")
    @ResponseBody
    public String add(@PathVariable int number1, @PathVariable int number2){
        return number1 + " + " + number2 + " = " + (number1+number2);
    }

    @GetMapping("/subtract/{number1}/from/{number2}")
    @ResponseBody
    public String subtract(@PathVariable int number1, @PathVariable int number2) {
        return number2 + " - " + number1 + " = " + (number2 - number1);
    }
    @GetMapping("/subtract/{number1}/from/{number2}/and/{number3}")
    @ResponseBody
    public int subtract(@PathVariable int number1, @PathVariable int number2, @PathVariable int number3) {
        return number2 - number1 - number3;
    }
    @GetMapping("/multiply/{num1}/and/{num2}")
    @ResponseBody
    public int multiply(@PathVariable int number1, @PathVariable int number2) {

        return number1 * number2;
    }

    @GetMapping("/divide/{num1}/by/{num2}")
    @ResponseBody
    public double multiply(@PathVariable double number1, @PathVariable double number2) {

        return number1 / number2;
    }

}
