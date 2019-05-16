package com.cwc.hrm_project.controller;

import com.cwc.hrm_project.service.UserService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@ResponseBody
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/index")
    public String login()throws Exception{
        return "index";
    }
}
