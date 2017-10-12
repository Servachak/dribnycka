package com.shop.controller;

import com.shop.service.DressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by adavi on 21.09.2017.
 */
@Controller
public class IndexController {
    @Autowired
    private DressService dressService;

    @GetMapping("/")
    public String getIndex(Model model){

        model.addAttribute("dressList",dressService.findAll());
        return "views-base-index";
    }
//    @PostMapping("/")
//    public String getHome(Model model){
//        model.addAttribute("dressList",dressService.findAll());
//        return "views-base-index";
//    }


}
