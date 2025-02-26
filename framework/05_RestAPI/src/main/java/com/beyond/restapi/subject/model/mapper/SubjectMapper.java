package com.beyond.restapi.subject.model.mapper;

import com.beyond.restapi.subject.model.vo.Subject;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

@Mapper
public interface SubjectMapper
{
    int selectSubjectCount(@Param("deptNo") String deptNo);

    List<Subject> selectAllByDeptNo(@Param("deptNo") String deptNo, RowBounds rowBounds);
}
