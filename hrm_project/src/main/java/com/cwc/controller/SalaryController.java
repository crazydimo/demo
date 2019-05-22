package com.cwc.controller;

import com.cwc.service.SalaryService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class SalaryController {
    @Resource
    private SalaryService salaryService;
}
