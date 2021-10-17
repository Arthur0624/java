package com.lyc.dao;

import com.lyc.domain.Student;

import java.util.List;

public interface StudentDao {

    Student selectByID(Integer id);
    List<Student> selectStudents();
}
