package com.yuge.readmybatis.mapper;

import com.yuge.readmybatis.entity.Student;
import com.yuge.readmybatis.entity.Teacher;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

/**
 * @Author zhongcanyu
 * @Date 2024/1/21
 */
@Component
@Mapper
public interface TeacherMapper {

    @Insert("insert into teacher(namd,age,toClass) values (#{name},#{age},#{toClass})")
    void add(Teacher teacher);

    @Update("update teacher set name=#{name},age=#{age},toClass=#{toClass} where id=#{id}")
    int update(Student student);

    @Delete("delete from student where id=#{id}")
    int deleteById(String sno);

    @Select(("select * from teacher where name=#{name} and toClass=#{toClass}"))
    @Results(id = "teacher", value = {
            @Result(property = "id", column = "id", javaType = Integer.class),
            @Result(property = "name", column = "name", javaType = String.class),
            @Result(property = "age", column = "age", javaType = Integer.class),
            @Result(property = "toClass", column = "toClass", javaType = String.class),
    })
    Teacher queryTeacherByNameAndToClass(String name, String toClass);
}
