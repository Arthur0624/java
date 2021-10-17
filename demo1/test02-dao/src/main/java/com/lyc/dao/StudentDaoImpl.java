package com.lyc.dao;

import com.lyc.domain.Student;
import com.lyc.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDaoImpl  implements StudentDao{
    @Override
    public Student selectById(Integer id) {
        SqlSession session = MyBatisUtil.getSqlSession();
//        String sqlId = "com.lyc.dao.StudentDao.selectById";
        String sqlId = "com.lyc.dao.StudentDao.selectById";
        Student student = session.selectOne(sqlId,id);
        session.close();
        return student;
    }

    @Override
    public List<Student> selectStudents() {
        SqlSession session = MyBatisUtil.getSqlSession();
        String sqlId = "com.lyc.dao.StudentDao.selectStudents";
        List<Student> students = session.selectList(sqlId);
        session.close();
        return students;
    }

    @Override
    public int insertStudent(Student student) {
        SqlSession session = MyBatisUtil.getSqlSession();
        String sql = "com.lyc.dao.StudentDao.insertStudent";
        int i = session.insert(sql, student);
        session.commit();
        session.close();
        return i;
    }
}
