package BookServer.com.zzx.uti;

import BookServer.po.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/13.
 */
public class ConMysqlUtil {
    static Connection connection = null;
    static Statement st = null;
    static ResultSet rs = null;
    public static void main(String[] args) {
        User user = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入操作内容\n1.插入\n2.查找");
        int chose = scanner.nextInt();
        if(chose==1){
            System.out.println("输入账号：");
            user.setName(scanner.next());
            System.out.println("输入密码：");
            user.setPwd(scanner.next());
            insertUserByUser(user);
        }
        if(chose==2){
            System.out.println("输入账号：");
            user.setName(scanner.next());
            user = findUserByName(user);
            System.out.println("账号："+user.getName()+"密码："+user.getPwd());
        }


     /*   //1.加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");//反射原理
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("没成功！");
        }

        //2.建立数据库连接
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookmanager","root","root");
            if(connection==null){
                System.out.println("链接不成功！");
            }else {
                System.out.println("链接成功！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //3.准备好sql语句
        String sql = "insert into user(name,pwd) values('zzx','123')";
        //4.传数据

        try {
            st = connection.createStatement();
            int num = st.executeUpdate(sql);
            if(num==1){
                System.out.println("成功！");
            }else {
                System.out.println("失败！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //查找的实现
        String sql2 = "select * from user";
        try {
            List<User> list = new ArrayList();
            ResultSet rs =  st.executeQuery(sql2);
            while(rs.next()){
                User user = new User();
                String name = rs.getString("name");
                String pwd = rs.getString ("pwd");
                user.setName(name);
                user.setPwd(pwd);
                list.add(user);

            }
            System.out.println(list);
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
    }

    //链接数据库初始化----封装方法
    public static void init(){
        //1.加载驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");//反射原理
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("没成功！");
        }

        //2.建立数据库连接
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookmanager","root","root");
            if(connection==null){
                System.out.println("链接不成功！");
            }else {
                System.out.println("链接成功！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void insertUserByUser(User user){
        init();
        String sql = "insert into user(name,pwd) values(?,?)";
        try {

            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,user.getName());
            pst.setString(2,user.getPwd());
            int num = pst.executeUpdate();
            if(num==1){
                System.out.println("插入成功！");
            }
            pst.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //查找-----封装的方法
    public static User findUserByName(User user){
        List <User> list = new ArrayList<>();
        init();
        String sql = "select * from user where name=?";
        try {
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,user.getName());
            rs = pst.executeQuery();
            while (rs.next()){

                String name = rs.getString("name");
                String pwd = rs.getString("pwd");
                user.setName(name);
                user.setPwd(pwd);
                list.add(user);
            }
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
