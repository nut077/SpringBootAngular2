package com.nutfreedom.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class UserResources {

    @RequestMapping("/user/users")
    public String loginSuccess() {
        return "login Successful!";
    }
}
