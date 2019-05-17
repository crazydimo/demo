package com.cwc.service;

import com.cwc.model.User;

public interface UserService {
    User login(User user);
    boolean register(User user);
}
