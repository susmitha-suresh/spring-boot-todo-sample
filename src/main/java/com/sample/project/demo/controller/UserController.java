package com.sample.project.demo.controller;

import com.sample.project.demo.entity.UserDetails;
import com.sample.project.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/saveUserDetails")
    public UserDetails addUserDetails(@RequestBody UserDetails userDetails){
        return userService.saveUser(userDetails);

    }
}
