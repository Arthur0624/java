package com.lyc.dao;

import com.lyc.domain.User;
import com.lyc.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDaoimpl  implements UserDao{
    Connection conn =null;
    PreparedStatement ps = null;

    public void save(User user) {
        try {
            conn = JDBCUtils.getConnection();
            String sql = "insert into my_user values(?,?,?)";
             ps = conn.prepareStatement(sql);
             ps.setInt(1,user.getId());
             ps.setString(2,user.getName());
             ps.setString(3,user.getPassword());
            int i = ps.executeUpdate(sql);
            System.out.println(i);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.getClose(conn,ps);
        }

    }
}
