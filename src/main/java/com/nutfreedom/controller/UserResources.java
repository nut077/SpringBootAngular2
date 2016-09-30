package com.nutfreedom.controller;

import com.nutfreedom.model.User;
import com.nutfreedom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class UserResources {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/users")
    public String loginSuccess() {
        return "login Successful!";
    }

    @RequestMapping(value = "/user/username", method = RequestMethod.POST)
    public User findByUsername(@RequestBody String username) {
        return userService.findByUsername(username);
    }
}
