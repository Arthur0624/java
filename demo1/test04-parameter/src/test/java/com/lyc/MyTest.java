package com.lyc;

import com.lyc.domain.Student;
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
    public void testSelectStudents(){
        SqlSession session = MyBatisUtil.getSqlSession();
        String sqlId = "com.lyc.dao.StudentDao.selectStudents";
        List<Student> students = session.selectList(sqlId);
        for (Student student : students) {
            System.out.println(student);
        }
        session.close();
    }

    @Test
    public void insertStudent(){
        SqlSession session = MyBatisUtil.getSqlSession();
        String sqlId = "com.lyc.dao.StudentDao.insertStudent";
        Student student = new Student();
        student.setId(6);
        student.setName("李白");
        student.setAge(17);
        int i = session.insert(sqlId, student);
        session.commit();
        System.out.println(i);
        session.close();
    }
}
