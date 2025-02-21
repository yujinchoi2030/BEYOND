package com.beyond.restapi.department.model.service;

import com.beyond.restapi.department.model.mapper.DepartmentMapper;
import com.beyond.restapi.department.model.vo.Department;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService
{
    private final DepartmentMapper departmentMapper;

    @Override
    public List<Department> getDepartments()
    {
        return departmentMapper.selectAll();
    }
}
