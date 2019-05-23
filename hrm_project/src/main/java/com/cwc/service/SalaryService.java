package com.cwc.service;

import com.cwc.model.Salary;

import java.util.List;

public interface SalaryService {
    boolean addSalary(Salary salary);
    boolean delSalary(Salary salary);
    boolean updateSalary(Salary salary);
    List<Salary> querySalaryByEid(Salary salary);
    Salary querySalary();
}
