package com.suidls.hibernate.controller;

import com.suidls.hibernate.entity.UserDetails;
import com.suidls.hibernate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/saveUser")
    public UserDetails saveUser(@RequestBody UserDetails userDetails) {

        return userService.saveUser(userDetails);

    }

}
