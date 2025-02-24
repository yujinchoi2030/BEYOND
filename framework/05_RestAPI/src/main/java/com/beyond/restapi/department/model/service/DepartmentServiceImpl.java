package com.beyond.restapi.department.model.service;

import com.beyond.restapi.department.model.mapper.DepartmentMapper;
import com.beyond.restapi.department.model.vo.Department;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService
{
    private final DepartmentMapper departmentMapper;

    @Override
    public int getTotalCount(String openYn)
    {
        return departmentMapper.selectDepartmentsCount(openYn);
    }

    @Override
    public List<Department> getDepartments(int page, int numOfRows, String openYn)
    {
        /*
        마이바티스에서는 페이징 처리 위해 RowBounds라는 클래스를 제공해 준다.
        RowBounds의 객체를 생성할 때 offset과 limit 값을 전달해서 페이징 처리를 쉽게 구현한다.
        (offset 만큼 건너뛰고 limit 만큼 가져온다.) = (offset부터 시작해서 limit만큼의 데이터를 반환)

        offset = 0, limit = 10
                - 0개를 건너뛰고 10개를 가져온다. (1 ~ 10)

        offset = 10, limit = 10
                - 10개를 건너뛰고 10개를 가져온다. (11 ~ 20)

        offset = 20, limit = 10
                - 20개를 건너뛰고 10개를 가져온다. (21 ~ 30)
        */

        int limit = numOfRows;
        int offset = (page - 1) * limit;

        RowBounds rowBounds = new RowBounds(offset, limit);

//        if(true)
//        {
//            throw new RuntimeException("서비스 실행 중 에러 발생");
//        }

        // openYn은 공개 여부를 필터링하는 조건으로 사용, rowBounds는 페이징을 처리하는 데 사용
        return departmentMapper.selectAll(openYn, rowBounds);
    }

    @Override
    public Optional<Department> getDepartmentByNo(String deptNo)
    {
        return departmentMapper.selectDepartmentByNo(deptNo);
    }

    @Override
    @Transactional
    public void save(Department department)
    {
        if(department.getNo() != null)
        {
            // update
        }
        else
        {
            // insert
            departmentMapper.insertDepartment(department);
        }
    }
}
