package com.lyc;

import com.lyc.Utils.MyBatisUtils;
import com.lyc.dao.studentDao;
import com.lyc.domain.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Mytest {
    @Test
    public void testselectStudentById(){
        SqlSession session = MyBatisUtils.getSqlSession();
        String sqlId = "com.lyc.dao.studentDao.selectStudentById";
       Student student = session.selectOne(sqlId,2);
        System.out.println(student);
    }

    @Test
    public void test02(){
        SqlSession session = MyBatisUtils.getSqlSession();
     studentDao dao = session.getMapper(studentDao.class);
        Student student = dao.selectStudentById(6);
        System.out.println(student);
    }
    @Test
    public void testSelectAll(){
        SqlSession session = MyBatisUtils.getSqlSession();
        studentDao dao = session.getMapper(studentDao.class);
        List<Student> students = dao.selectAll("张三");
        students.forEach(student -> System.out.println("student = " + student));
    }

    @Test
    public void testselectByNameOrderBy(){
        SqlSession session = MyBatisUtils.getSqlSession();
        studentDao dao = session.getMapper(studentDao.class);
        List<Student> students = dao.selectByNameOrderBy("student", "name");
        students.forEach(student -> System.out.println("student = " + student));
    }
}
