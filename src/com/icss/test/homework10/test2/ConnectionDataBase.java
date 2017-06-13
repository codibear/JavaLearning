package com.icss.test.homework10.test2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 29185 on 2017/6/13.
 */
public class ConnectionDataBase {
    static Connection connection;
    public static void main(String[] args) {
        List list = new ConnectionDataBase().selectMaster();

        System.out.println("\t\t\t主人信息列表\n\n编号\t\t姓名\t\t\t元宝数");
        for (Object o:list) {
            Master master = (Master)o;
            System.out.println(master.getId()+"\t\t\t"+master.getName()+"\t\t\t"+master.getMoney());
        }
    }
    public void init(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/epet","root","root");
            if(connection==null){
                System.out.println("建立连接失败");
            }else {
                System.out.println("建立连接成功");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public List selectMaster(){
        List<Master> masters = new ArrayList<>();
        init();
        String sql = "select * from master";
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                Master m = new Master();
                int id = rs.getInt("mid");
                String name = rs.getString("mname");
                int money = rs.getInt("mmoney");
                m.setId(id);
                m.setName(name);
                m.setMoney(money);
                masters.add(m);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return masters;
    }
}
