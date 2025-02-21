package com.beyond.restapi.department.model.service;

import com.beyond.restapi.department.model.vo.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService
{
    List<Department> getDepartments();
}
