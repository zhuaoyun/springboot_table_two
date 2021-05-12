package com.zay.service;

import com.zay.po.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentService {

    //查询全部
    List<Student> findAll();

    //查询单个
    Student findById(@Param("s_id") int s_id);

    //添加
    int addStudent(Student student);

    //修改
    int uptStudent(Student student);


    //删除
    int delStudent(@Param("s_id") int s_id);
}
