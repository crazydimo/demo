package com.cwc.hrm_project.service;

import com.cwc.hrm_project.model.User;

public interface UserService {
    User login(User user);
    boolean register(User user);
}
