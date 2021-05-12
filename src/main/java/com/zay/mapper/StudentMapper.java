package com.zay.mapper;

import com.zay.po.Student;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {

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