package com.zay.mapper;

import com.zay.po.Teacher;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherMapper {
    Teacher findById(@Param("t_id") int t_id);

    List<Teacher> selectAll();
}
