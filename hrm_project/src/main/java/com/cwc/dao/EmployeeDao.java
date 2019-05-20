package com.cwc.dao;

import com.cwc.model.Employee;

public interface EmployeeDao {
    boolean addEmployee(Employee employee);
    boolean delEmployee(Employee employee);
    boolean updateEmployee(Employee employee);
    Employee queryEmployeeByEid(Employee employee);
    Employee queryEmployeeByENameAndEPass(Employee employee);
    Employee queryEmployee();
}
