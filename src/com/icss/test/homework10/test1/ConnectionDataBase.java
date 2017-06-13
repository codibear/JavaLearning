package com.icss.test.homework10.test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by 29185 on 2017/6/13.
 */
public class ConnectionDataBase {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/epet","root","root");
            if(connection==null){
                System.out.println("创建连接失败");
            }else {
                System.out.println("创建连接成功");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
