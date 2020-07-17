package com.java.jdbc;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        //初始化界面
        Map<String,String> userLoginInfo = inITUI();
        //验证用户名和方法
        boolean userSuccess = login (userLoginInfo);

        System.out.println(userSuccess?"登陆成功":"登陆失败");
    }

    /**
     * 用户登录
     * @param userLoginInfo 用户登录信息
     * @return false 登陆失败 ,true 登陆成功
     */
    private static boolean login(Map<String, String> userLoginInfo) {
        //打标记
        boolean loginsuccess = false;

        //JDBC代码
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/user-login","root","333");
            //3.获取数据库操作对象
            stmt =conn.createStatement();
            //4.执行Sql
            String sql ="select * from userid where username ='"+userLoginInfo.get("uesrname")+"' and password = '"+userLoginInfo.get("userpassword")+"'";
            rs = stmt.executeQuery(sql);
            //5.处理结果集
            if(rs.next()){
                loginsuccess = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            //6.释放资源
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return loginsuccess;
    }

    /**
     *初始化用户界面
     * @return 返回用户输入的用户名和密码等信息
     */
    private static Map<String, String> inITUI() {
        Scanner s = new Scanner(System.in);

        System.out.print("用户名");
        String loginName =s.nextLine();

        System.out.print("密码");
        String loginPwd =s.nextLine();

        Map<String,String> userLoginInfo = new HashMap<>();
        userLoginInfo.put("uesrname",loginName);
        userLoginInfo.put("userpassword",loginPwd);
        return userLoginInfo;
    }

}
