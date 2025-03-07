package com.beyond.university.department.model.service;

import com.beyond.university.department.model.vo.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {
    int getTotalCount(String openYn);

    List<Department> getDepartments(int page, int numOfRows, String openYn);

    Optional<Department> getDepartmentByNo(String deptNo);

    void save(Department department);

    void delete(String deptNo);
}
