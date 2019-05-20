package com.cwc.service.impl;

import com.cwc.dao.DepartmentDao;
import com.cwc.model.Department;
import com.cwc.service.DepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Resource
    private DepartmentDao departmentDao;

    public boolean addDepartment(Department department) {
        if (department==null){
            return false;
        }
        return departmentDao.addDepartment(department);
    }

    public boolean delDepartment(Department department) {
        if (department==null){
            return false;
        }
        return departmentDao.delDepartment(department);
    }

    public boolean updateDepartment(Department department) {
        if (department==null){
            return false;
        }
        return departmentDao.updateDepartment(department);
    }

    public List<Department> queryDepartment() {
        return departmentDao.queryDepartment();
    }
}
