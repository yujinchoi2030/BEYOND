package com.beyond.restapi.department.model.mapper;

import com.beyond.restapi.department.model.vo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Optional;

@Mapper
public interface DepartmentMapper
{
    int selectDepartmentsCount(@Param("openYn") String openYn);

    List<Department> selectAll(@Param("openYn") String openYn, RowBounds rowBounds);

    Optional<Department> selectDepartmentByNo(@Param("deptNo") String deptNo);

    void insertDepartment(Department department);

    void updateDepartment(Department department);

    void deleteDepartment(@Param("deptNo") String deptNo);

    List<Department> selectClassByDepartments(@Param("deptNo") String deptNo, RowBounds rowBounds);
}
