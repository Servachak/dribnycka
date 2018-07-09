package com.shop.controller;

import com.shop.service.ColorService;
import com.shop.service.DressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by adavi on 21.09.2017.
 */
@Controller
public class IndexController {
    @Autowired
    private DressService dressService;
    @Autowired
    private ColorService colorService;

    @GetMapping("/")
    public String getIndex(Model model){
        model.addAttribute("dressList",dressService.findAll());
        model.addAttribute("colorList",colorService.findAll());
        return "views-base-index";
    }
    @PostMapping("/")
    public String getHome(Model model){
        model.addAttribute("dressList",dressService.findAll());
        model.addAttribute("colorList",colorService.findAll());
        return "views-base-index";
    }


}
