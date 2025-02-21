package com.beyond.restapi.department.model.mapper;

import com.beyond.restapi.department.model.vo.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper
{
    List<Department> selectAll();
}
