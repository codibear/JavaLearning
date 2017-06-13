package com.icss.test.homework10.test3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/13.
 */
public class ConnectionDataBase {
    static Connection connection;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pet> list = new ArrayList<>();
        System.out.println("请输入2条狗的信息：");
        for(int i = 1;i<3;i++){
            Pet dog = new Dog();
            dog.setPtype("狗");
            System.out.println("我是第"+i+"条狗！");
            System.out.println("请输入名字：");
            dog.setPname(scanner.next());
            System.out.println("请输入主人名字：");
            dog.setMname(scanner.next());
            list.add(dog);
        }
        new ConnectionDataBase().insetPetByO(list);

    }
    public void init(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/epet","root","root");
            if(connection==null){
                System.out.println("创建连接失败");
            }else{
                System.out.println("创建连接成功");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void insetPetByO(List<Pet> list){
        String sql = "insert into pet(pname,ptype,mname)values(?,?,?)";
        init();
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            for(int i = 0;i<list.size();i++){
                Pet pet=(Dog)list.get(i);
                ps.setString(1,pet.getPname());
                ps.setString(2,pet.getPtype());
                ps.setString(3,pet.getMname());
                int num = ps.executeUpdate();
                if(num==1){
                    System.out.println("第"+(i+1)+"只狗插入成功！");
                }else {
                    System.out.println("插入失败@");
                }
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
