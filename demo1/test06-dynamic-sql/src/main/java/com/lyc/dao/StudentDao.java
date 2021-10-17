package com.lyc.dao;

import com.lyc.domain.Student;
import com.lyc.domain.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
        List<Student> selectIf(Student student);

        //foreach-1
        List<Student> selectForeachOne(List<Integer> list);
        //foreach-2
        List<Student> selectForeachTWo(List<Student> studentList);
}
