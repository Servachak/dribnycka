package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by adavi on 21.09.2017.
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String getIndex(){
        return "views-base-index";
    }


}
