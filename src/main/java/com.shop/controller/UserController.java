package com.shop.controller;

import com.shop.entity.User;
import com.shop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by adavi on 29.09.2017.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;



    @GetMapping("/registration")
    public String getRegistration(Model model){
        model.addAttribute("listUser", userService.findAll());
        return "registration";
    }

    @PostMapping("/registration")
    public String setRegistration(@RequestParam String name,
                                  @RequestParam String email,
                                  @RequestParam String pass,
                                  @RequestParam String phoneNumber){


        try {
            userService.save(new User(name,email,pass,phoneNumber));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return  "redirect:/";
    }
    @GetMapping("deleteUser/{id}")
    public String deleteUser(@PathVariable int id){
        userService.delete(id);
        return "redirect:/registration";
    }
    @GetMapping("/updateUser/{id}")
    public String updateUser(@PathVariable int id,Model model){

        User user = userService.findOne(id);
        model.addAttribute("currentUser",user);

        return "updateUser";
    }
    @PostMapping("/updateUser/{id}")
    public  String updateUser(@RequestParam String name,
                              @RequestParam String email,
                              @RequestParam String pass,
                              @RequestParam String phoneNumber,
                              @PathVariable int id){

        User user = userService.findOne(id);

        user.setName(name);
        user.setEmail(email);
        user.setPassword(pass);
        user.setPhoneNumber(phoneNumber);

        try {
            userService.update(user);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return  "redirect:/registration";
    }

}
