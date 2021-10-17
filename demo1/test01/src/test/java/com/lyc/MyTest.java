package com.lyc;

import com.lyc.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MyTest {
    @Test
    public void testSelectStudentById() throws IOException {
        //mybatis核心类：
        String config = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(config);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        //naemspace+.+id的值
        String sqlId ="com.lyc.dao.studentDao"+"."+"selectStudentById";
       Student student =  session.selectOne(sqlId,2);
        System.out.println(student);
//        mybatis默认执行sql语句是手动提交事务
//        String sqlId = "com.lyc.dao.studentDao"+"."+"insertStudent";
//        int rows = session.insert(sqlId);
//        session.commit();
//        System.out.println(rows);
        session.close();
    }
    @Test
    public void insertStudent() throws Exception{
        String config = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(config);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        String sqlId = "com.lyc.dao.studentDao.insertStudent";
        Student student = new Student();
        student.setId(5);
        student.setName("tom");
        student.setAge(17);
        int i = session.insert(sqlId,student);
        session.commit();
        System.out.println(i);
        session.close();
    }
}
