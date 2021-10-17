package com.lyc.dao;

import com.lyc.domain.Student;
import com.lyc.domain.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    Student selectById(Integer id);
    Long selectCoulmn();
    Teacher selectTeacher(@Param("stuid") int id);
    List<Student> selectLike(@Param("name") String name);
}
