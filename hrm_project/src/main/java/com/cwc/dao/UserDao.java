package com.cwc.dao;

import com.cwc.model.User;

import java.util.List;

public interface UserDao {
    boolean addUser(User user);
    User queryUserNameAndPass(User user);
    User queryUserById(User user);
    List<User> queryUser(User user);
}
