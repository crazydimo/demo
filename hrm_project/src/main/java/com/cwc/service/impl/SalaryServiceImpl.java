package com.cwc.service.impl;

import com.cwc.dao.SalaryDao;
import com.cwc.model.Salary;
import com.cwc.service.SalaryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SalaryServiceImpl implements SalaryService {
    @Resource
    private SalaryDao salaryDao;
    public boolean addSalary(Salary salary) {
        if (salary==null){
            return false;
        }
        return salaryDao.addSalary(salary);
    }

    public boolean delSalary(Salary salary) {
        if (salary==null){
            return false;
        }
        return salaryDao.delSalary(salary);
    }

    public boolean updateSalary(Salary salary) {
        if (salary==null){
            return false;
        }
        return salaryDao.updateSalary(salary);
    }

    public List<Salary> querySalaryByEid(Salary salary) {
        if (salary==null){
            return null;
        }
        return salaryDao.querySalaryByEid(salary);
    }

    public Salary querySalary() {
        return salaryDao.querySalary();
    }
}
