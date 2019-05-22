package com.cwc.dao;

import com.cwc.model.Salary;

public interface SalaryDao {
    boolean addSalary(Salary salary);
    boolean delSalary(Salary salary);
    boolean updateSalary(Salary salary);
    Salary querySalary();
}
