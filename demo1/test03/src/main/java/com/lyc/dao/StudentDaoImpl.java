package com.lyc.dao;

import com.lyc.Utils.MyBatisUtil;
import com.lyc.domain.Student;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDaoImpl  implements StudentDao{
    @Override
    public Student selectByID(Integer id) {
        SqlSession session = MyBatisUtil.getSqlSession();
        String sqlId = "com.lyc.dao.StudentDao.selectByID";
        Student student = session.selectOne(sqlId,id);
        return student;
    }

    @Override
    public List<Student> selectStudents() {
        SqlSession session = MyBatisUtil.getSqlSession();
        String sqlId = "com.lyc.dao.StudentDao.selectStudents";
        List<Student> students = session.selectList(sqlId);
        return students;
    }
}
