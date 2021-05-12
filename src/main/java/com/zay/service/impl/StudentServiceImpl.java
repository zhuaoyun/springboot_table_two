package com.zay.service.impl;

import com.zay.mapper.StudentMapper;
import com.zay.po.Student;
import com.zay.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }

    @Override
    public Student findById(int s_id) {
        return studentMapper.findById(s_id);
    }

    @Override
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    @Override
    public int uptStudent(Student student) {
        return studentMapper.uptStudent(student);
    }

    @Override
    public int delStudent(int s_id) {
        return studentMapper.delStudent(s_id);
    }
}
