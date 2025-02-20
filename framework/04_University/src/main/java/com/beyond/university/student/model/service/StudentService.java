package com.beyond.university.student.model.service;

import com.beyond.university.student.model.vo.Student;

import java.util.List;

public interface StudentService {
    List<Student> getStudentsByDeptNo(String deptNo);

    Student getStudentByNo(String sno);

    int save(Student student);

    int delete(String sno);
}
