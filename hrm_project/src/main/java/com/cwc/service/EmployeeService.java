package com.cwc.service;

import com.cwc.model.Employee;

import java.util.List;

public interface EmployeeService {
    boolean addEmployee(Employee employee);
    boolean delEmployee(Employee employee);
    boolean updateEmployee(Employee employee);
    Employee queryEmployeeByEid(Employee employee);
    List<Employee> queryEmployeeByPosId(Employee employee);
    Employee login(Employee employee);
    Employee queryEmployee();
}
