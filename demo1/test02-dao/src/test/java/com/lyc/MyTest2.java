package com.lyc;

import com.lyc.dao.StudentDao;
import com.lyc.dao.StudentDaoImpl;
import com.lyc.domain.Student;
import org.junit.Test;

import java.util.List;

public class MyTest2 {
    @Test
    public void testSelectOne(){
        StudentDao dao = new StudentDaoImpl();
        Student student = dao.selectById(1);
        System.out.println(student);
    }
    @Test
    public void testSelectList(){
        StudentDaoImpl dao = new StudentDaoImpl();
        List<Student> students = dao.selectStudents();
        students.forEach(student -> System.out.println(student));
    }
    @Test
    public void testInsertStudent(){
        StudentDaoImpl dao = new StudentDaoImpl();
        Student student = new Student();
        student.setId(7);
        student.setName("秦始皇");
        student.setAge(55);
        int i = dao.insertStudent(student);
        System.out.println(i);
    }
}
