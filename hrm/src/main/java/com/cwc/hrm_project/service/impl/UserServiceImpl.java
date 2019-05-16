package com.cwc.hrm_project.service.impl;

import com.cwc.hrm_project.dao.UserDao;
import com.cwc.hrm_project.model.User;
import com.cwc.hrm_project.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public User login(User user) {
        if (user==null) {
            return null;
        }
        return userDao.queryUserNameAndPass(user);
    }

    @Override
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
}
