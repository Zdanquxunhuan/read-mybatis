package com.yuge.readmybatis.service;

import com.yuge.readmybatis.entity.Student;

/**
 * @Author zhongcanyu
 * @Date 2024/1/16
 */
public interface StudentService {
    int add(Student student);
    int update(Student student);
    int deleteBysno(String sno);
    Student queryStudentBySno(String sno);
    Student queryStudentBySnoAndName(String sno,String name);

}
