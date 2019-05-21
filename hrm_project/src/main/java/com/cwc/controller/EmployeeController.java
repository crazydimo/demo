package com.cwc.controller;

import com.cwc.model.Employee;
import com.cwc.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class EmployeeController {
    @Resource
    private EmployeeService employeeService;

    @RequestMapping("showEmployee")
    public String showEmployee(Integer eid)throws Exception{
        Employee employee = new Employee();
        employee.setEmp_id(eid);
        Employee employee1 = employeeService.queryEmployeeByEid(employee);
        return "";
    }

    @RequestMapping("loginEmployee")
    public String loginEmployee(Employee employee, HttpSession session)throws Exception{
        Employee employee1 = employeeService.login(employee);
        if (employee1!=null){
            session.setAttribute("employee",employee);
            return "employeeMain";
        }
        return "../../index";
    }
    @RequestMapping("updateEmployee")
    public String updateEmployee(Employee employee, HttpSession session)throws Exception{
        employeeService.updateEmployee(employee);
        return "";
    }
    @RequestMapping("queryEmployee")
    public List<Employee> queryEmployee(Integer pos_id,HttpSession session)throws Exception{
        Employee employee = new Employee();
        employee.setEmp_posId(pos_id);
        List<Employee> employees = employeeService.queryEmployeeByPosId(employee);
        session.setAttribute("employeesAdmin",employees);
        return employees;
    }

}
