package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by adavi on 21.09.2017.
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String getIndex(){
        return "index";
    }

    @GetMapping("/registration")
    public String getRegistration(){
        return "registration";
    }
    @PostMapping("/registration")
    public String setRegistration(@RequestParam String name,
                                  @RequestParam String email,
                                  @RequestParam String password,
                                  @RequestParam String phoneNumber){

        return  "redirect:/registration";
    }
}
