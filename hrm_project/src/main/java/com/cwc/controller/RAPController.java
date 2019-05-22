package com.cwc.controller;

import com.cwc.service.RAPService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class RAPController {
    @Resource
    private RAPService rapService;
}
