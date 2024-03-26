package com.yuge.readmybatis.service.impl;

import com.yuge.readmybatis.entity.Student;
import com.yuge.readmybatis.mapper.StudentMapper;
import com.yuge.readmybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author zhongcanyu
 * @Date 2024/1/16
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int add(Student student) {
        return this.studentMapper.add(student);
    }

    @Override
    public int update(Student student) {
        return this.studentMapper.update(student);
    }

    @Override
    public int deleteBysno(String sno) {
        return this.studentMapper.deleteBysno(sno);
    }

    @Override
    public Student queryStudentBySno(String sno) {
        return this.studentMapper.queryStudentBySno(sno);
    }

    @Transactional
    @Override
    public Student queryStudentBySnoAndName(String sno, String name) {
        return studentMapper.queryStudentBySnoAndName(sno,name);
    }
}
