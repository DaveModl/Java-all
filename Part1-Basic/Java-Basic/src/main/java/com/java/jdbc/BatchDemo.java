package com.java.jdbc;

import java.sql.*;

public class BatchDemo {
    public static void main(String[] args) {
        Connection conn = null;
        //批处理的Sql执行器
        Statement stat = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test-jdbc","root","root");
            //关闭自动提交
            conn.setAutoCommit(false);
            String sql = "";
            stat = conn.createStatement();
            for (int i = 0; i < 20000 ; i++) {
                stat.addBatch(sql);
            }
            stat.executeBatch();
            conn.commit();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
