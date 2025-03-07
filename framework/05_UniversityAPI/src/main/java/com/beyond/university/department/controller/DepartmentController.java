package com.beyond.university.department.controller;


import com.beyond.university.common.exception.UniversityException;
import com.beyond.university.common.exception.message.ExceptionMessage;
import com.beyond.university.common.model.dto.BaseResponseDto;
import com.beyond.university.common.model.dto.ItemsResponseDto;
import com.beyond.university.department.model.dto.DepartmentRequestDto;
import com.beyond.university.department.model.service.DepartmentService;
import com.beyond.university.department.model.vo.Department;
import com.beyond.university.subject.model.service.SubjectService;
import com.beyond.university.subject.model.vo.Subject;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

/*
    Department APIs

    1) 학과 목록 조회
     - GET /api/v1/university-service/departments
    
    2) 학과 상세 조회
     - GET /api/v1/university-service/departments/{department-no}
    
    3) 학과 등록
     - POST /api/v1/university-service/departments
    
    4) 학과 수정
     - PUT /api/v1/university-service/departments/{department-no}
    
    5) 학과 삭제
     - DELETE /api/v1/university-service/departments/{department-no}

    6) 학과별 수업 과목 조회
     - GET /api/v1/university-service/departments/{department-no}/subjects
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/university-service")
@Tag(name = "Department APIs", description = "학과 관련 API 목록")
public class DepartmentController {
    private final DepartmentService departmentService;
    private final SubjectService subjectService;

    @GetMapping("/departments")
    @Operation(summary = "학과 목록 조회", description = "전체 학과의 목록을 조회한다.")
    @Parameters({
            @Parameter(name = "page", description = "페이지 번호", example = "1"),
            @Parameter(name = "numOfRows", description = "한 페이지 결과 수", example = "10"),
            @Parameter(name = "openYn", description = "개설 여부", example = "Y")
    })
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "OK",
                    content = @Content(mediaType = "application/json")
//                    content = @Content(
//                            mediaType = "application/json",
//                            schema = @Schema(implementation = DepartmentsResponseDto.class)
//                    )
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "NOT FOUND",
                    content = @Content(mediaType = "application/json")
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "INTERNAL SERVER ERROR",
                    content = @Content(mediaType = "application/json")
            )
    })
    public ResponseEntity<ItemsResponseDto<Department>> getDepartments(@RequestParam int page,
                                                           @RequestParam int numOfRows, @RequestParam(required = false) String openYn) {

        int totalCount = departmentService.getTotalCount(openYn);
        List<Department> departments = departmentService.getDepartments(page, numOfRows, openYn);

        if (!departments.isEmpty()) {
            return ResponseEntity.ok(
                    new ItemsResponseDto<>(HttpStatus.OK, departments, page, totalCount)
            );
        } else {
            // JSON 형태로 응답을 보낸 필요가 없을 때 아래와 같이 작성한다.
            // return ResponseEntity.noContent().build();
            // 상태 코드가 204일 때는 본문을 포함할 수 없기 때문에 JSON 형태로 응답이 필요할 때는 아래와 같이 작성한다.
            // return ResponseEntity.ok(
            //         new DepartmentsResponseDto(HttpStatus.NO_CONTENT, departments, page, totalCount)
            // );
            throw new UniversityException(ExceptionMessage.DEPARTMENT_NOT_FOUND);
        }
    }
    
    @Operation(summary = "학과 상세 조회", description = "학과 번호로 학과의 상세 정보를 조회한다.")
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "OK",
                    content = @Content(mediaType = "application/json")
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "NOT FOUND",
                    content = @Content(mediaType = "application/json")
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "INTERNAL SERVER ERROR",
                    content = @Content(mediaType = "application/json")
            )
    })
    @GetMapping("/departments/{department-no}")
    public ResponseEntity<BaseResponseDto<Department>> getDepartment(
            @Parameter(description = "학과 번호", example = "001") @PathVariable("department-no") String deptNo) {
        Department department = departmentService.getDepartmentByNo(deptNo)
                    .orElseThrow(() -> new UniversityException(ExceptionMessage.DEPARTMENT_NOT_FOUND));

        return ResponseEntity.ok(new BaseResponseDto<>(HttpStatus.OK, department));
    }

    @PostMapping("/departments")
    @Operation(summary = "학과 등록", description = "학과 정보를 JSON으로 받아서 등록한다.")
    @ApiResponses({
            @ApiResponse(
                    responseCode = "201",
                    description = "CREATED",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "BAD REQUEST",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
            ),
            @ApiResponse(
                    responseCode = "401",
                    description = "UNAUTHORIZED",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "INTERNAL SERVER ERROR",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
            )
    })
    // public ResponseEntity<Void> create(@RequestBody DepartmentRequestDto requestDto) {
    public ResponseEntity<BaseResponseDto<Department>> create(
            @Valid @RequestBody DepartmentRequestDto requestDto) {
        Department department = requestDto.toDepartment();

        departmentService.save(department);

        // return ResponseEntity.created(URI.create("/api/v1/university-service/departments/" + department.getNo())).build();
        return ResponseEntity.created(URI.create("/api/v1/university-service/departments/" + department.getNo()))
                .body(new BaseResponseDto<>(HttpStatus.CREATED, department));
    }

    @PutMapping("/departments/{department-no}")
    @Operation(summary = "학과 정보 수정", description = "학과 정보를 JSON으로 받아 수정한다.")
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "OK",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
            ),
            @ApiResponse(
                    responseCode = "400",
                    description = "BAD REQUEST",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
            ),
            @ApiResponse(
                    responseCode = "401",
                    description = "UNAUTHORIZED",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "NOT FOUND",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "INTERNAL SERVER ERROR",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
            )
    })
    // public ResponseEntity<Void> update(
    public ResponseEntity<BaseResponseDto<Department>> update(
            @Parameter(description = "학과 번호", example = "001") @PathVariable("department-no") String deptNo,
            @Valid @RequestBody DepartmentRequestDto requestDto) {

        Department department = departmentService.getDepartmentByNo(deptNo)
                .orElseThrow(() -> new UniversityException(ExceptionMessage.DEPARTMENT_NOT_FOUND));

        department.setDepartmentRequestDto(requestDto);

        departmentService.save(department);

        // return ResponseEntity.noContent().build();
        return ResponseEntity.ok(new BaseResponseDto<>(HttpStatus.OK, department));
    }

    @DeleteMapping("departments/{department-no}")
    @Operation(summary = "학과 삭제", description = "학과 번호로 해당 학과를 삭제한다.")
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "OK",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
            ),
            @ApiResponse(
                    responseCode = "401",
                    description = "UNAUTHORIZED",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
            ),
            @ApiResponse(
                    responseCode = "403",
                    description = "FORBIDDEN",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "NOT FOUND",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "INTERNAL SERVER ERROR",
                    content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE)
            )
    })
    // public ResponseEntity<Void> delete(
    public ResponseEntity<BaseResponseDto<Department>> delete(
            @Parameter(description = "학과 번호", example = "001") @PathVariable("department-no") String deptNo) {

        Department department = departmentService.getDepartmentByNo(deptNo)
                .orElseThrow(() -> new UniversityException(ExceptionMessage.DEPARTMENT_NOT_FOUND));

        departmentService.delete(department.getNo());

        // return ResponseEntity.noContent().build();
        return ResponseEntity.ok(new BaseResponseDto<>(HttpStatus.OK, department));
    }

    @GetMapping("/departments/{department-no}/subjects")
    @Operation(summary = "학과별 과목 목록 조회", description = "학과 번호로 해당 학과에 포함된 과목들을 조회한다.")
    @Parameters({
            @Parameter(name = "department-no", description = "학과 번호", example = "001"),
            @Parameter(name = "page", description = "페이지 번호", example = "1"),
            @Parameter(name = "numOfRows", description = "한 페이지 결과 수", example = "10")
    })
    @ApiResponses({
            @ApiResponse(
                    responseCode = "200",
                    description = "OK",
                    content = @Content(mediaType = "application/json")
            ),
            @ApiResponse(
                    responseCode = "404",
                    description = "NOT FOUND",
                    content = @Content(mediaType = "application/json")
            ),
            @ApiResponse(
                    responseCode = "500",
                    description = "INTERNAL SERVER ERROR",
                    content = @Content(mediaType = "application/json")
            )
    })
    public ResponseEntity<ItemsResponseDto<Subject>> getSubjects(
            @PathVariable("department-no") String deptNo,
            @RequestParam int page, @RequestParam int numOfRows) {
        int totalCount = subjectService.getTotalCount(deptNo);
        List<Subject> subjects = subjectService.getSubjectsByDeptNo(deptNo, page, numOfRows);

        if (!subjects.isEmpty()) {
            return ResponseEntity.ok(new ItemsResponseDto<>(HttpStatus.OK, subjects, page, totalCount));
        } else {
            return ResponseEntity.noContent().build();
        }
    }
}