package com.shop.controller;

import com.shop.entity.Color;
import com.shop.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by adavi on 20.10.2017.
 */
@Controller
public class ColorController {

    @Autowired
    private ColorService colorService;

    @GetMapping("/color")
    public  String color(Model model){
        model.addAttribute("listColor",colorService.findAll());
        return "views-admin-color";
    }

    @PostMapping("/color")
    public String color(@RequestParam String colorName){

        colorService.save(new Color(colorName));
        return "redirect:/color";
    }
    @GetMapping("/deleteColor/{id}")
    public String deleteColor(@PathVariable int id){
        colorService.delete(id);
        return "redirect:/color";
    }

    @GetMapping("/updateColor/{id}")
    public String updateColor(Model model,@PathVariable int id){
        Color color = colorService.findOne(id);
        model.addAttribute("currentColor",color);
        return "views-admin-updateColor";
    }

    @PostMapping("/updateColor/{id}")
    public String updateColor(@PathVariable int id,
                              @RequestParam String colorName){

        Color color = colorService.findOne(id);

        color.setColorName(colorName);

         colorService.update(color);
        return "redirect:/color";
    }
}
