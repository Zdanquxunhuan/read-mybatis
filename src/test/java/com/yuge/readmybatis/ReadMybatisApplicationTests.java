package com.yuge.readmybatis;

import com.yuge.readmybatis.entity.Student;
import com.yuge.readmybatis.entity.Teacher;
import com.yuge.readmybatis.service.StudentService;
import com.yuge.readmybatis.service.TeacherService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ReadMybatisApplicationTests {

    @Autowired
    private StudentService studentService;
    @Autowired
    private TeacherService teacherService;

    @Test
    public void testQuery(){
        Student student = studentService.queryStudentBySno("666");
        System.out.println(student);

    }

    @Test
    public void testQuery2(){
        Student zyx = studentService.queryStudentBySnoAndName("777", "zyx");
        System.out.println(zyx);
        Teacher teacher = teacherService.queryTeacherByNameAndToClass("tang", "4");
        System.out.println(teacher);
    }

}
