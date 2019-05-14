package com.cwc.hrm.dao;

import com.cwc.hrm.model.User;

import java.util.List;

public interface UserDao {
    boolean addUser(User user);
    User queryUserNameAndPass(User user);

    List<User> queryUser(User user);
}
