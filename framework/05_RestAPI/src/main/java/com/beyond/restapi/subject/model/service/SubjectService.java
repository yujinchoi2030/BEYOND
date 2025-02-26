package com.beyond.restapi.subject.model.service;

import com.beyond.restapi.subject.model.vo.Subject;

import java.util.List;

public interface SubjectService
{
    int getTotalCount(String deptNo);

    List<Subject> getSubjectByDeptNo(String deptNo, int page, int numOfRows);
}
