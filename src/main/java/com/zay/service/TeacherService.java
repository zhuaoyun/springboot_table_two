package com.zay.service;

import com.zay.po.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherService {

    List<Teacher> selectAll();
    Teacher findById(@Param("t_id") int t_id);

}
