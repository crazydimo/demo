package com.cwc.controller;

import com.cwc.model.Department;
import com.cwc.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class DepartmentController {
    @Resource
    private DepartmentService departmentService;

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    @RequestMapping("createDepartment")
    public void createDepartment(Department department, HttpServletResponse response)throws Exception{
        PrintWriter out= response.getWriter();
        department.setDep_time(sdf.format(new Date()));
        if (departmentService.addDepartment(department)){
            out.print("<script language='javascript'>alert('创建成功');window.location.href='flushAdmin';</script>");

        }else {
            out.print("<script language='javascript'>alert('创建失败');window.location.href='flushAdmin';</script>");
        }

    }
    @RequestMapping("toCreateDepartment")
    public String toCreateDepartment()throws Exception{
        return "createDepartment";
    }
}
