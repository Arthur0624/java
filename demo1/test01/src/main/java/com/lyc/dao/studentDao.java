package com.lyc.dao;

import com.lyc.domain.Student;

public interface studentDao {
    Student selectStudentById(Integer id);

    //添加学生
    //返回值表示添加行数
    int insertStudent(Student student);
}
