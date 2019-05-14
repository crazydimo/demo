package com.cwc.hrm.service;

import com.cwc.hrm.model.User;

public interface UserService {
    User login(User user);
    boolean register(User user);
}
