package com.lyc;

import com.lyc.Utils.MyBatisUtil;
import com.lyc.dao.StudentDaoImpl;
import com.lyc.domain.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Mytest {
    @Test
    public void testSelectById(){
        StudentDaoImpl dao = new StudentDaoImpl();
        Student student = dao.selectByID(1);
        System.out.println(student);

    }
    @Test
    public void testSelectStudents(){
        StudentDaoImpl dao = new StudentDaoImpl();
        List<Student> students = dao.selectStudents();
        students.forEach(student -> System.out.println(student));
    }
}
