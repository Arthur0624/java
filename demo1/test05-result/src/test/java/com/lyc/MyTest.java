package com.lyc;

import com.lyc.dao.StudentDao;
import com.lyc.domain.Student;
import com.lyc.domain.Teacher;
import com.lyc.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MyTest {
    @Test
    public void testSelectById(){
        SqlSession session = MyBatisUtil.getSqlSession();
//        String sqlId = "com.lyc.dao.StudentDao.selectById";
        String sqlId = "com.lyc.dao.StudentDao.selectById";
        Student student = session.selectOne(sqlId,1);
        System.out.println(student);
        session.close();
    }

    @Test
    public void testselectCoulmn(){
        SqlSession session = MyBatisUtil.getSqlSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        Long nums = dao.selectCoulmn();
        System.out.println("nums = " + nums);
        session.close();
    }

    @Test
    public void testSelectTeacher(){
        SqlSession session = MyBatisUtil.getSqlSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        Teacher teachers = dao.selectTeacher(1);
        System.out.println(teachers);
    }

    @Test
    public void testSelectLike(){
        SqlSession session = MyBatisUtil.getSqlSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        List<Student> students = dao.selectLike("%李%");
        students.forEach(student -> System.out.println("student = " + student));
        session.close();
    }
}
