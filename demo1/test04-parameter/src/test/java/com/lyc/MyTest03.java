package com.lyc;

import com.lyc.dao.StudentDao;
import com.lyc.domain.Student;
import com.lyc.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest03 {
    @Test
    public void testSeelectById(){
        SqlSession session = MyBatisUtil.getSqlSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        Student student = dao.selectById(1);
        System.out.println("student = " + student);
        session.close();
    }
    @Test
    public void testSelectStudents(){
        SqlSession session = MyBatisUtil.getSqlSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        List<Student> students = dao.selectStudents();
        students.forEach(student -> System.out.println("student = " + student));
        session.close();
    }

    @Test
    public void testselectByNameOrAge(){
        SqlSession session = MyBatisUtil.getSqlSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        List<Student> students = dao.selectByNameOrAge("李四",18);
        students.forEach(student -> System.out.println(student));
        session.close();
    }

    @Test
    public void selectByObject(){
        SqlSession session = MyBatisUtil.getSqlSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        Student stu = new Student();
        stu.setName("张三");
        stu.setAge(17);
        List<Student> students = dao.selectByObject(stu);
        students.forEach(student -> System.out.println(student));
        session.close();
    }


    @Test
    public void testSelectByOption(){
        SqlSession session = MyBatisUtil.getSqlSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        List<Student> students = dao.selectByPosition("李四", 17);
        for (Student student : students) {
            System.out.println(student);
        }
        session.close();
    }

}
