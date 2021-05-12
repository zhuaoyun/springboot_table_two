package com.zay;

import com.zay.mapper.StudentMapper;

import com.zay.mapper.TeacherMapper;
import com.zay.po.Student;
import com.zay.po.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class SpringbootTableTwoApplicationTests {

    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private TeacherMapper teacherMapper;
    @Test
    void contextLoads() {

        /*List<Student> all = studentMapper.findAll();
        for (Student student : all) {
            System.out.println("student = " + student);
        }*/
      /*  List<Teacher> all = teacherService.findAll();
        for (Teacher teacher : all) {
            System.out.println("teacher = " + teacher);
        }*/
       /* List<Teacher> teachers = teacherMapper.selectAll();
        for (Teacher teacher : teachers) {
            System.out.println("teacher = " + teacher);
        }*/
       /* Student student = new Student();
        student.settId(1);
        student.setsName("祝奥运");
        student.setsUsername("sadas");
        student.setsPassword("123456");
        student.setsAddress("河南");
        student.setsBirth(new Date());
        student.setsSex("男");
        student.settId(1002);
        int i = studentMapper.uptStudent(student);
        System.out.println("i = " + i);*/
        /*Student student = new Student();
        student.setsId(13);
        student.setsBirth(new Date());
        student.setsSex("男");
        student.setsAddress("北京");
        student.setsName("zhu");
        student.setsPassword("123");
        student.setsUsername("zhu");
        student.settId(1002);
        System.out.println(studentMapper.uptStudent(student));*/
        Student byId = studentMapper.findById(1);
        System.out.println("byId = " + byId);
/*
        System.out.println("student = " + student);
*/
    }

}
