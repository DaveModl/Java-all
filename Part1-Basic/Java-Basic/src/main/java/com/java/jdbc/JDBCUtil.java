package com.java.jdbc;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCUtil {
    private static Properties properties = null;
    //加载资源文件
    static {
        properties = new Properties();
        try {
            properties.load(JDBCUtil.class.getClass().getClassLoader().getResourceAsStream("db.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        try {
            Class.forName(properties.getProperty("mysqlDriver"));
            Connection conn = DriverManager.getConnection(properties.getProperty("mysqlUrl"),properties.getProperty("username"),properties.getProperty("password"));
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void close(Connection conn, PreparedStatement ps, ResultSet rs){
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (ps != null){
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
