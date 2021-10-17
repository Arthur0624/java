package com.lyc.dao;

import com.lyc.domain.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    Student selectById(Integer id);
    List<Student> selectStudents();
    int insertStudent(Student student);

    /**
     * 多个简单类型参数。使用@Param命名
     */
    List<Student> selectByNameOrAge(@Param("myname") String name,@Param("myage") Integer age);
    /*
    一个java对象作为参数
     */
    List<Student> selectByObject(Student student);

    List<Student> selectByPosition(String name,Integer age);
}
