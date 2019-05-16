package com.cwc.hrm_project.dao;

import com.cwc.hrm_project.model.User;

import java.util.List;

public interface UserDao {
    boolean addUser(User user);
    User queryUserNameAndPass(User user);

    List<User> queryUser(User user);
}
