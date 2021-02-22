package com.codeup.springblog.controllers;

import org.apache.catalina.Group;
import org.apache.catalina.Role;
import org.apache.catalina.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class HomeyController {
    @RequestMapping("/index")
    public String home(Model model){
       model.addAttribute("formData", new User());
        return "pages/index";

    }
    @RequestMapping(value="/createGender", method = RequestMethod.POST)
    public String processFormDate(User user, RedirectAttributes attr){
        //Insert data admitted in the form to the database.
        attr.addFlashAttribute("user", user);
        return "redirect:/display";
    }
    public String displayFormData (User user){
        return "result";
    }
}
