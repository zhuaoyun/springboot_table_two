package com.zay.service.impl;

import com.zay.mapper.TeacherMapper;
import com.zay.po.Teacher;
import com.zay.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;


    @Override
    public List<Teacher> selectAll() {
        return teacherMapper.selectAll();
    }

    @Override
    public Teacher findById(int t_id) {
        return teacherMapper.findById(t_id);
    }
}
