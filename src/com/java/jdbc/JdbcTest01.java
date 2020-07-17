package com.java.jdbc;

    import java.sql.*;
    public class JdbcTest01{
        public static void main(String[]args){
            Connection conn = null;
            Statement stmt = null;
            //legacy.java.
            try{
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode","root","333");
                stmt = conn.createStatement();
                String sql = "insert into dept (deptno,dname,loc) values(50,'人事部','北京')";
                int count = stmt.executeUpdate(sql);
                System.out.println(count == 1?"成功":"失败");
            }catch(SQLException e){
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
            //1.注册驱动
            //2.获取连接
            //3.获取数据库操作对象
            //4.执行SQl语句
            //6.释放资源
        }
    }

