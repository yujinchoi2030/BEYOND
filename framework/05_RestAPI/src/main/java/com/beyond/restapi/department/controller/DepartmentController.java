package com.beyond.restapi.department.controller;

import com.beyond.restapi.department.model.service.DepartmentService;
import com.beyond.restapi.department.model.vo.Department;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
    1) 학과 목록 조회
        - GET/api/vi/university-service/departments

    2) 학과 상제 조회
        - GET/api/vi/university-service/departments/{department-no}

    3) 학과 등록
        - POST/api/vi/university-service/departments

    4) 학과 수정
        - PUT/api/vi/university-service/departments/{department-no}

    5) 학과 삭제
        - DELETE/api/vi/university-service/departments/{department-no}
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/university-service")
@Tag(name = "Department APIs", description = "학과 관련 API 목록")
public class DepartmentController
{
    private final DepartmentService departmentService;

    @GetMapping("/departments")
    @Operation(summary = "학과 목록 조회", description = "전체 학과의 목록을 조회한다.")
    public ResponseEntity<List<Department>> getDepartments()
    {
        List<Department> departments = departmentService.getDepartments();

        return ResponseEntity.ok(departments);
    }
}
