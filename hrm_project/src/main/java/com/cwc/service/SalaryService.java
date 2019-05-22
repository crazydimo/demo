package com.cwc.service;

import com.cwc.model.Salary;

public interface SalaryService {
    boolean addSalary(Salary salary);
    boolean delSalary(Salary salary);
    boolean updateSalary(Salary salary);
    Salary querySalary();
}
