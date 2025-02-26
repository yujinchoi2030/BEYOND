package com.beyond.restapi.department.controller;

import com.beyond.restapi.common.exception.UniversityException;
import com.beyond.restapi.common.exception.message.ExceptionMessage;
import com.beyond.restapi.common.model.dto.BaseResponseDto;
import com.beyond.restapi.common.model.dto.ItemsResponseDto;
import com.beyond.restapi.department.model.dto.DepartmentRequestDto;
import com.beyond.restapi.department.model.service.DepartmentService;
import com.beyond.restapi.department.model.vo.Department;
import com.beyond.restapi.subject.model.service.SubjectService;
import com.beyond.restapi.subject.model.vo.Subject;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

/*
    1) 학과 목록 조회
        - GET/api/vi/university-service/departments

    2) 학과 상세 조회
        - GET/api/vi/university-service/departments/{department-no}

    3) 학과 등록
        - POST/api/vi/university-service/departments

    4) 학과 수정
        - PUT/api/vi/university-service/departments/{department-no}

    5) 학과 삭제
        - DELETE/api/vi/university-service/departments/{department-no}
        - 응답은 204 (no content), 200 (ok)

    6) 학과별 수업 과목 조회
        - GET/api/vi/university-service/departments/{department-no}/subjects
        - 파라미터는 page, numOfRows
        - 응답은 200
 */

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/university-service")
@Tag(name = "Department APIs", description = "학과 관련 API 목록")
public class DepartmentController
{
    private final DepartmentService departmentService;
    private final SubjectService subjectService;

    // 1) 학과 목록 조회
    @GetMapping("/departments")
    @Operation(summary = "학과 목록 조회", description = "전체 학과의 목록을 조회한다.")
    @Parameters
        ({
            @Parameter(name = "page", description = "페이지 번호", example = "1")
            ,@Parameter(name = "numOfRows", description = "한 페이지 결과 수", example = "10")
            ,@Parameter(name = "openYn", description = "개설 여부", example = "Y")
        })
    @ApiResponses
        ({
            @ApiResponse(responseCode = "200", description = "OK"
                    //, content = @Content(mediaType = "application/json"))
                    // 스키마 정보를 읽어다가 알아서 JSON 으로 만들어 줌
                    , content = @Content(mediaType = "application/json", schema = @Schema(implementation = ItemsResponseDto.class)))
            ,@ApiResponse(responseCode = "404", description = "NOT FOUND", content = @Content(mediaType = "application/json"))
            ,@ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR", content = @Content(mediaType = "application/json"))
        })
    // ResponseEntity - HTTP 응답을 나타내는 클래스 (HTTP 응답을 명시적으로 설정하거나 커스터마이징할 필요가 있을 때)
    public ResponseEntity<ItemsResponseDto<Department>> getDepartments(@RequestParam int page
                                                                , @RequestParam int numOfRows
                                                                , @RequestParam(required = false) String openYn)
    {
        int totalCount = departmentService.getTotalCount(openYn);

        List<Department> departments = departmentService.getDepartments(page, numOfRows, openYn);

        if (!departments.isEmpty())
        {
            return ResponseEntity.ok(new ItemsResponseDto<>(HttpStatus.OK, departments, page, totalCount));
        }
        else
        {
            // JSON 형태로 응답을 보낸 필요가 없을 때 아래와 같이 작성한다.
            // return ResponseEntity.noContent().build();
            // 상태 코드가 204일 때는 본문을 포함할 수 없기 때문에 JSON 형태로 응답이 필요할 때는 아래와 같이 작성한다.
//            return ResponseEntity.ok
//                    (
//                        new DepartmentsResponseDto(HttpStatus.NO_CONTENT, departments, page, totalCount)
//                    );
            throw new UniversityException(ExceptionMessage.DEPARTMENT_NOT_FOUND);
        }
    }

    // 2) 학과 상세 조회
    @Operation(summary = "학과 상세 조회", description = "학과 번호로 학과의 상세 정보를 조회한다.")
    @ApiResponses
        ({
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ItemsResponseDto.class)))
            ,@ApiResponse(responseCode = "404", description = "NOT FOUND", content = @Content(mediaType = "application/json"))
            ,@ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR", content = @Content(mediaType = "application/json"))
        })
    @GetMapping("/departments/{department-no}")
    public ResponseEntity<BaseResponseDto<Department>> getDepartment(
            @Parameter(description = "학과번호", example = "001")
            @PathVariable("department-no") String deptNo)
    {
        // Optional<> - 값이 존재할 수도 있고 존재하지 않을 수도 있는 값을 감싸는 클래스
        Department department = departmentService.getDepartmentByNo(deptNo)
                .orElseThrow(() -> new UniversityException(ExceptionMessage.DEPARTMENT_NOT_FOUND));

        return ResponseEntity.ok(new BaseResponseDto<>(HttpStatus.OK, department));
    }

    // 3) 학과 등록
    @PostMapping("/departments")
    @Operation(summary = "학과 등록", description = "학과 정보를 JSON으로 받아서 등록한다.")
    @ApiResponses
        ({
            @ApiResponse(responseCode = "201", description = "CREATED", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE))
            ,@ApiResponse(responseCode = "400", description = "BAD_REQUEST", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE))
            ,@ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE))
        })
    //public ResponseEntity<Void> create(@RequestBody DepartmentRequestDto requestDto)
    public ResponseEntity<BaseResponseDto<Department>> create(@Valid @RequestBody DepartmentRequestDto requestDto)
    {
        Department department = requestDto.toDepartment();

        departmentService.save(department);

        return ResponseEntity.created(URI.create("/api/v1/university-service/departments/" + department.getNo()))
                .body(new BaseResponseDto<>(HttpStatus.CREATED, department));
    }

    // 4) 학과 수정
    @PutMapping("/departments/{department-no}")
    @Operation(summary = "학과 수정", description = "학과 정보를 JSON으로 받아서 수정한다.")
    @ApiResponses
            ({
                    @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE))
                    ,@ApiResponse(responseCode = "400", description = "BAD_REQUEST", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE))
                    ,@ApiResponse(responseCode = "404", description = "NOT FOUND", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE))
                    ,@ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE))
            })
    //public ResponseEntity<Void> update(@PathVariable("department-no") String deptNo, @Valid @RequestBody DepartmentRequestDto requestDto)
    public ResponseEntity<BaseResponseDto<Department>> update(@Parameter(description = "학과번호", example = "001")
                                                              @PathVariable("department-no") String deptNo
                                                            , @Valid @RequestBody DepartmentRequestDto requestDto)
    {
        Department department = departmentService.getDepartmentByNo(deptNo)
                .orElseThrow(() -> new UniversityException(ExceptionMessage.DEPARTMENT_NOT_FOUND));

        department.setDepartmentRequestDto(requestDto);

        departmentService.save(department);

        //return ResponseEntity.noContent().build();
        return ResponseEntity.ok(new BaseResponseDto<>(HttpStatus.OK, department));
    }

    // 5) 학과 삭제
    @DeleteMapping("/departments/{department-no}")
    @Operation(summary = "학과 삭제", description = "학과 번호로 해당 학과를 삭제한다.")
    @ApiResponses
            ({
                    @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE))
                    ,@ApiResponse(responseCode = "404", description = "NOT FOUND", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE))
                    ,@ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE))
            })
    public ResponseEntity<BaseResponseDto<Department>> delete(@Parameter(description = "학과번호", example = "001") @PathVariable("department-no") String deptNo)
    {
        Department department = departmentService.getDepartmentByNo(deptNo)
                .orElseThrow(() -> new UniversityException(ExceptionMessage.DEPARTMENT_NOT_FOUND));

        departmentService.delete(department.getNo());

        return ResponseEntity.ok(new BaseResponseDto<>(HttpStatus.OK, department));
    }

    //

    // 6) 학과별 수업 과목 조회
    @GetMapping("/departments/{department-no}/subjects")
    @Operation(summary = "학과별 과목 목록 조회", description = "학과 번호로 해당 학과에 포함된 과목들을 조회한다.")
    @Parameters
            ({
                    @Parameter(name = "department-no", description = "학과 번호", example = "001")
                    ,@Parameter(name = "page", description = "페이지 번호", example = "1")
                    ,@Parameter(name = "numOfRows", description = "한 페이지 결과 수", example = "10")
            })
    @ApiResponses
            ({
                    @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE))
                    ,@ApiResponse(responseCode = "404", description = "NOT FOUND", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE))
                    ,@ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE))
            })
    public ResponseEntity<ItemsResponseDto<Subject>> getSubjects(@PathVariable("department-no") String deptNo, @RequestParam int page, @RequestParam int numOfRows)
    {
        int totalCount = subjectService.getTotalCount(deptNo);

        List<Subject> subjects = subjectService.getSubjectByDeptNo(deptNo, page, numOfRows);

        if (!subjects.isEmpty())
        {
            return ResponseEntity.ok(new ItemsResponseDto<>(HttpStatus.OK, subjects, page, totalCount));
        }
        else
        {
            return ResponseEntity.noContent().build();
        }
    }
}
