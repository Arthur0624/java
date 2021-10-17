package com.lyc;

import com.lyc.dao.StudentDao;
import com.lyc.dao.StudentDaoImpl;
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
}
