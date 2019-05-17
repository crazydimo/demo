package com.cwc.dao;

import com.cwc.model.Department;

import java.util.List;

public interface DepartmentDao {
    boolean addDepartment(Department department);
    boolean delDepartment(Department department);
    boolean updateDepartment(Department department);
    List<Department> queryDepartment();
}
