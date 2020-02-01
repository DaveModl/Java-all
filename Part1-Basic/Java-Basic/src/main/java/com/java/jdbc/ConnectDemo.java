package com.java.jdbc;

import java.sql.*;

public class ConnectDemo {
    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            //加载数据库驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //返回数据库连接对象
            /**连接池优化*/
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test-jdbc","root","root");
            //创建SQL执行接口对象
            String sql = "";
//            Statement stat = conn.createStatement();
//            stat.execute(sql);
             ps = conn.prepareStatement(sql);
//            ps.setObject();
//            ps.setDate("1",new Date(System.currentTimeMillis()));
             rs = ps.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt(1));
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if (rs != null){
                rs.close();
            }
            if (ps != null){
                ps.close();
            }

            if (conn != null){
                conn.close();
            }
        }
    }
}
