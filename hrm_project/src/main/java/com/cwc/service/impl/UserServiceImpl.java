package com.cwc.service.impl;

import com.cwc.dao.UserDao;
import com.cwc.model.User;
import com.cwc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    public User login(User user) {
        if (user==null) {
            return null;
        }
        return userDao.queryUserNameAndPass(user);
    }

    public boolean register(User user) {
        if (user==null) {
            return false;
        }
        List<User> users = userDao.queryUser(user);
        for (User user1 : users) {
            if (user1.getUser_name().equals(user.getUser_name())){
                return false;
            }
        }
        return userDao.addUser(user);
    }

    public User queryUserById(User user) {
        if (user==null) {
            return null;
        }
        return userDao.queryUserById(user);
    }

}
