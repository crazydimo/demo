package com.cwc.service.impl;

import com.cwc.dao.EmployeeDao;
import com.cwc.model.Employee;
import com.cwc.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    private EmployeeDao employeeDao;
    public boolean addEmployee(Employee employee) {
        if (employee == null){
            return false;
        }
        return employeeDao.addEmployee(employee);
    }

    public boolean delEmployee(Employee employee) {
        if (employee == null){
            return false;
        }
        return employeeDao.delEmployee(employee);
    }

    public boolean updateEmployee(Employee employee) {
        if (employee == null){
            return false;
        }
        return employeeDao.updateEmployee(employee);
}

    public Employee queryEmployeeByEid(Employee employee) {
        if (employee == null){
            return null;
        }
        return employeeDao.queryEmployeeByEid(employee);
    }

    public Employee login(Employee employee) {
        if (employee == null){
            return null;
        }
        return employeeDao.queryEmployeeByENameAndEPass(employee);
    }

    public Employee queryEmployee() {
        return employeeDao.queryEmployee();
    }
}
