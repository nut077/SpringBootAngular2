package com.nutfreedom.service;

import com.nutfreedom.model.User;

public interface UserService {
    User saveUser(User user);
    User findByUsername(String username);
}
