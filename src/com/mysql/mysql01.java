package com.mysql;
/*1、取得每个部门最高薪水的人员名称
  思路
    1.获取每个部门的最高工资 显示部门编号和最高工资
    2.使用步骤1的查询结果，为临时表temptable 进行多表查询 并使用员工的deptno 和 sal与temptable 同时消除笛卡尔积
    3.使用步骤1的查询结果替换temptable
     */

import java.sql.*;
import java.util.*;

public class mysql01 {

    public static void main(String[] args) {

        ResourceBundle bundle = ResourceBundle.getBundle("jdbc");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");

        Connection conn = null;
        Statement stmt = null;
        ResultSet re = null;

        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,password);
            stmt =conn.createStatement();
            String sql = "";
            int count = stmt.executeUpdate(sql);
            System.out.println(count == 1?"成功":"失败");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            if(stmt != null ){
                try{
                    stmt.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
            if(conn != null ){
                try{
                    conn.close();
                }catch(SQLException e){
                    e.printStackTrace();
                }
            }
        }


    }

}
