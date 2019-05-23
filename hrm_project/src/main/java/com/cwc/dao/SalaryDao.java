package com.cwc.dao;

import com.cwc.model.Salary;

import java.util.List;

public interface SalaryDao {
    boolean addSalary(Salary salary);
    boolean delSalary(Salary salary);
    boolean updateSalary(Salary salary);
    List<Salary> querySalaryByEid(Salary salary);
    Salary querySalary();
}
