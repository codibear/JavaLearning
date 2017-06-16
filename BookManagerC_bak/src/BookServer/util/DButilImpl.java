package BookServer.util;

import java.sql.*;

/**
 * Created by 29185 on 2017/6/14.
 * 这个其实就是一个工具类
 *
 */
public class DButilImpl implements IDButil {
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    private  Connection conn = null;
    //创建数据库连接
    @Override
    public void getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookmanager","root","root");

            if(conn==null){
                System.out.println("创建连接失败@");
            }else {
                System.out.println("创建连接成功！");
            }

        } catch (ClassNotFoundException e) {

        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    //关闭数据库连接
    @Override
    public void closeConnection() {
            try {
                if (rs!=null){
                    rs.close();
                }if (pst!=null){
                    pst.close();
                }if (conn!=null){
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

    }
    //增加数据
    @Override
    public int add(String string, Object[] objects) {
        int num = 0;
        getConnection();
        try {
            pst = conn.prepareStatement(string);
            for(int i = 0;i<objects.length;i++){
                pst.setObject(i+1,objects[i]);
            }
            num = pst.executeUpdate();
            if(num>0){
                System.out.println("插入成功！");
            }else {
                System.out.println("插入失败@");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return num;
    }
    //删除数据
    @Override
    public int delete(String string, Object[] objects) {
        int num=0;
        getConnection();
        try {
            pst = conn.prepareStatement(string);
            for(int i = 0;i<objects.length;i++){
                pst.setObject(i+1,objects[i]);
            }
            num = pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return num;
    }
    //更新数据
    @Override
    public int update(String string, Object[] objects) {
        int num = 0;
        getConnection();
        try {
            pst = conn.prepareStatement(string);
            for(int i = 0;i<objects.length;i++){
                pst.setObject(i+1,objects[i]);
            }
            num = pst.executeUpdate();
            if(num>0){
                System.out.println("更新成功！");
            }else {
                System.out.println("更新失败@");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return num;
    }
    //查询数据
    @Override
    public ResultSet select(String string, Object[] objects) {
        getConnection();
        if(objects==null){
            try {
                pst = conn.prepareStatement(string);
                rs = pst.executeQuery();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else {
            try {
                pst = conn.prepareStatement(string);
                for(int i = 0;i<objects.length;i++){
                    pst.setObject(i+1,objects[i]);
                }
                rs = pst.executeQuery();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return rs;
    }
}
