package com.lyc.util;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {
    public static Connection getConnection() throws  Exception{
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("druid.properties");
        Properties properties = new Properties();
        properties.load(is);
        String driverClassName = properties.getProperty("driverClassName");
        Class.forName(driverClassName);
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        Connection conn = DriverManager.getConnection(url, username, password);
        return conn;
    }


public static  void getClose(Connection conn , PreparedStatement ps){
    if(conn != null){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    if(ps !=null){
        try {
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
}
