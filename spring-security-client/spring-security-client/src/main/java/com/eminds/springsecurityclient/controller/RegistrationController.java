package com.eminds.springsecurityclient.controller;

import com.eminds.springsecurityclient.entity.User;
import com.eminds.springsecurityclient.model.UserModel;
import com.eminds.springsecurityclient.repository.UserReposotory;
import com.eminds.springsecurityclient.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {

    @Autowired
    private UserService userService;

    @PostMapping
    public String registerUser(@RequestBody UserModel userModel){


        User user = userService.registerUser(userModel);

        return "Sucess";
    }
}
