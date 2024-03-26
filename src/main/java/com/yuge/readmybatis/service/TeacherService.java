package com.yuge.readmybatis.service;

import com.yuge.readmybatis.entity.Teacher;

/**
 * @Author zhongcanyu
 * @Date 2024/1/21
 */
public interface TeacherService {
    Teacher queryTeacherByNameAndToClass(String name, String toClass);
}
