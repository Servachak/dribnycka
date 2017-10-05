package com.shop.controller;

import com.shop.entity.Dress;
import org.springframework.ui.Model;
import com.shop.service.DressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by adavi on 29.09.2017.
 */
@Controller
public class DressController {

    @Autowired
    private DressService dressService;

    @GetMapping("/dress")
        public String getDress(Model model){

        model.addAttribute("listDress",dressService.findAll());
            return "dress";
        }

    @PostMapping("/dress")
    public String getDress(@RequestParam String dressName,
                           @RequestParam String dressColor,
                           @RequestParam String dressType,
                           @RequestParam String dressSex,
                           @RequestParam String dressSize
    ){

        try {
            dressService.save(new Dress(dressName,dressColor,dressType,dressSex,dressSize));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "redirect:/dress";
    }
    @GetMapping("/deleteDress/{id}")
    public String deleteDress(@PathVariable int id){

        dressService.delete(id);
        return "redirect:/dress";
    }
    @GetMapping("/updateDress/{id}")
    public  String updateDress(@PathVariable int id, Model model){
        Dress dress = dressService.findOne(id);
        model.addAttribute("currentDress", dress);
        return "updateDress";
    }

    @PostMapping("/updateDress/{id}")
    public String updateDress(@PathVariable int id,
                              @RequestParam String dressName,
                              @RequestParam String dressColor,
                              @RequestParam String dressType,
                              @RequestParam String dressSex,
                              @RequestParam String dressSize){

        Dress dress = dressService.findOne(id);

        dress.setName(dressName);
        dress.setColor(dressColor);
        dress.setType(dressType);
        dress.setSex(dressSex);
        dress.setSize(dressSize);

        try {
            dressService.update(dress);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "redirect:/dress";

    }
}
