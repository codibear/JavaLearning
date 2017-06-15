package jdbc.jdbcOOP.util;

import java.sql.*;

/**
 * Created by 29185 on 2017/6/14.
 */
public class DButil {
    private Connection conn = null;
    private Statement st = null;
    private PreparedStatement pst = null;
    private ResultSet rs;
    //打开链接
    public void getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
            if(conn!=null){
                System.out.println("创建连接成功！");
            }else {
                System.out.println("创建连接失败！");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }


    //增
    public void insert(String string,Object [] objects){
        getConnection();
        try {
            pst = conn.prepareStatement(string);
            for (int i = 0;i<objects.length;i++){
                pst.setObject(i+1,objects[i]);//在这里相当于多条具体的set信息，如setInt（）;setString（）；
            }
            int num = pst.executeUpdate();
            if(num>0){
                System.out.println("插入成功！");
            }else {
                System.out.println("插入失败@");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //closeConnection();
    }


    //删
    public void delete(String string,Object [] objects){
        getConnection();
        try {
            pst = conn.prepareStatement(string);
            for (int i = 0;i<objects.length;i++){
                pst.setObject(i+1,objects[i]);
            }
            int num = pst.executeUpdate();
            if(num>0){
                System.out.println("删除成功！");
            }else {
                System.out.println("删除失败@");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //closeConnection();
    }


    //改
    public void update(String string,Object [] objects){
        getConnection();
        try {
            pst = conn.prepareStatement(string);
            for (int i = 0;i<objects.length;i++){
                pst.setObject(i+1,objects[i]);
            }
            int num = pst.executeUpdate();
            if(num>0){
                System.out.println("更改成功！");
            }else {
                System.out.println("更改失败@");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //closeConnection();---------------应该在类外调用完这个方法后，再去调用close关闭
    }


    //查
    public ResultSet select(String string,Object [] objects){
        getConnection();
        if(objects==null){
            try {
                pst = conn.prepareStatement(string);
                rs =  pst.executeQuery();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else {
            try {
                pst = conn.prepareStatement(string);
                for (int i = 0;i<objects.length;i++){
                    pst.setObject(i+1,objects[i]);
                }
                rs =  pst.executeQuery();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        //closeConnection();
        return rs;
    }

    //关闭连接
    public void closeConnection(){
            try {
                if(conn!=null){
                    conn.close();
                }
                if(pst!=null){
                    pst.close();
                }if(st!=null){
                    st.close();
                }if(rs!=null){
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
}
