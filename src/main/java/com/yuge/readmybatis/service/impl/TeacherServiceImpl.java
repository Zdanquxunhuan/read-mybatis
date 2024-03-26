package com.yuge.readmybatis.service.impl;

import com.yuge.readmybatis.entity.Teacher;
import com.yuge.readmybatis.mapper.TeacherMapper;
import com.yuge.readmybatis.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author zhongcanyu
 * @Date 2024/1/21
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Override
    public Teacher queryTeacherByNameAndToClass(String name, String toClass) {
        return teacherMapper.queryTeacherByNameAndToClass(name, toClass);
    }
}
