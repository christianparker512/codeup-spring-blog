package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Ad;
import com.codeup.springblog.repository.AdRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/////first step is to set up controller
@Controller
public class AdController {

    ////instance of the interface here called the adDao.
    private final AdRepository adDao;


    //    Dependency injection right here takes it in via parameter
    public AdController(AdRepository adDao) {
        this.adDao = adDao;
    }

    //this is a jpa example
    @GetMapping("/ads/jpa")
    @ResponseBody
    ///Returns a list of ads
    public List<Ad> jpaIndex() {
        //we are referencing the adDao. THis finds all the lists. Has to be called findAll(); Can't call this anything else
        return adDao.findAll();
    }

    //GetOne
    // this will allow us to get one specific ad.
    @GetMapping("/ads/jpa/{id}")
    @ResponseBody
    //returning a string that returns the ad I'm looking for.
    //First thing is a path variable that needs to be a long.

    public String viewJpaAd(@PathVariable long id) {
        //return adDao.getOne(id); will not work. This will return the ad object. It won't print out as a string. SO use the one below.
        return adDao.getOne(id).toString();
    }
    //this @getmapping will go to the specific ad.
    //not require a response body.
    //it will represent the string to represent the view.
    //We need to represent the view we're sending this to by including the Model model.
    //store as an 'Ad myAd = adDao.getOne(id);
    //setting the attribute.
    @GetMapping("ads/{id}")
    public String viewAd(@PathVariable long id, Model model) {
        Ad myAd = adDao.getOne(id);
        model.addAttribute("ad", myAd);
        return "ads/show";
    }
//    //Don't want to have the form.
//    //it won't return anything. Just want to create an ad
//    //we have a form, we are submitting, creates an ad and sends a bunch of information.
//
//    @GetMapping("/ads/jpa/create")
//    public void createAd() {
//        Ad ad = new Ad();
//        ad.setTitle("Yellow Submarine");
//        ad.setDescription("we all live in a yellow submarine");
//
//        adDao.save(ad);
//    }
//    //delete
//    //hardcode a delete...Should be using a pathvariable.
//
//    @GetMapping("/ads/jpa/delete")
//    public void deleteAd() {
//        adDao.deleteById(6L);
//    }
//
//    @GetMapping("/ads/search")
//    @ResponseBody
//    public Ad returnAdByTitle(){
//        return adDao.findByTitle("Fundamental");
//    }
//    @GetMapping("/ads/order")
//    @ResponseBody
//    public List<Ad> returnAdsByTitle(){
//        return adDao.findByOrderByTitle();
//    }
    }
