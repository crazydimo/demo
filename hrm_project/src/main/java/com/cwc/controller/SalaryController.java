package com.cwc.controller;

import com.cwc.model.Employee;
import com.cwc.model.Salary;
import com.cwc.service.SalaryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class SalaryController {
    @Resource
    private SalaryService salaryService;

    @RequestMapping("checkSalaryEmp")
    public String checkSalaryEmp(HttpSession session)throws Exception{
        Employee employee = (Employee) session.getAttribute("employee");
        Salary salary = new Salary();
        salary.setSal_eid(employee.getEmp_id());
        List<Salary> salaries = salaryService.querySalaryByEid(salary);
        session.setAttribute("salaries",salaries);
        return "";
    }

    @RequestMapping("wageSettlementAdmin")
    public String wageSettlementAdmin()throws Exception{
        
    }
}
