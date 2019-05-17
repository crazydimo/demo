package com.cwc.service;

import com.cwc.model.Department;

import java.util.List;

public interface DepartmentService {
    boolean addDepartment(Department department);
    boolean delDepartment(Department department);
    boolean updateDepartment(Department department);
    List<Department> queryDepartment();
}
