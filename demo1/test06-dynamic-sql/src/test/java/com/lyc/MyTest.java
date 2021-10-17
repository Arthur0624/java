package com.lyc;

import com.lyc.dao.StudentDao;
import com.lyc.domain.Student;
import com.lyc.domain.Teacher;
import com.lyc.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MyTest {
    @Test
    public void testselectIf() {
        SqlSession session = MyBatisUtil.getSqlSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        Student student = new Student();
        student.setName("张三");
        student.setAge(28);
        List<Student> students = dao.selectIf(student);
        students.forEach(student1 -> System.out.println("student1 = " + student1) );
    }
    @Test
    public void testselectForeachOne() {
        SqlSession session = MyBatisUtil.getSqlSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        ArrayList<Integer> idlist = new ArrayList<>();
        idlist.add(1);
        idlist.add(2);
        idlist.add(3);
        List<Student> students = dao.selectForeachOne(idlist);
        students.forEach(student1 -> System.out.println("student1 = " + student1) );
        session.close();
    }

    @Test
    public void testselectForeachWTwo() {
        SqlSession session = MyBatisUtil.getSqlSession();
        StudentDao dao = session.getMapper(StudentDao.class);
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setId(1);
        student2.setId(2);
        students.add(student1);
        students.add(student2);
        List<Student> list = dao.selectForeachTWo(students);
        System.out.println(list);
        session.close();
    }

}
