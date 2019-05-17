package com.cwc.controller;

import com.cwc.service.RecruitService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class RecruitController {

    @Resource
    private RecruitService recruitService;

    @RequestMapping
    public String showRecruit()throws Exception{
        return "";
    }
}
