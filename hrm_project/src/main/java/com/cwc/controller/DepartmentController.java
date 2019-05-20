package com.cwc.controller;

import com.cwc.model.Department;
import com.cwc.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class DepartmentController {
    @Resource
    private DepartmentService departmentService;

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    @RequestMapping("createDepartment")
    public String createDepartment()throws Exception{
        Department department = new Department();
        department.setDep_time(sdf.format(new Date()));
        departmentService.addDepartment(department);
        return "";
    }
}
