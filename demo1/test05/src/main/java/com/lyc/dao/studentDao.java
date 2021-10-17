package com.lyc.dao;

import com.lyc.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface studentDao {
    Student selectStudentById(int id);

    List<Student> selectAll(@Param("myName") String name);
    List<Student> selectByNameOrderBy(@Param("mytable") String table,@Param("myname") String name);
}
