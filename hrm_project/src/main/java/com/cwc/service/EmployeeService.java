package com.cwc.service;

import com.cwc.model.Employee;

public interface EmployeeService {
    boolean addEmployee(Employee employee);
    boolean delEmployee(Employee employee);
    boolean updateEmployee(Employee employee);
    Employee queryEmployeeByEid(Employee employee);
    Employee login(Employee employee);
    Employee queryEmployee();
}
