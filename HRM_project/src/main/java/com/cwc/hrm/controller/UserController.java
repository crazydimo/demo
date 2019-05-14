package com.cwc.hrm.controller;

import com.cwc.hrm.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping
    public String login()throws Exception{

        return "";
    }
}
