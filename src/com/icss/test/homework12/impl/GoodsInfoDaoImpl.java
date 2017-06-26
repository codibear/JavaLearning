package com.icss.test.homework12.impl;

import com.icss.test.homework12.dao.GoodsInfoDao;

import java.sql.*;

/**
 * Created by 29185 on 2017/6/14.
 * 这个其实就是一个工具类
 *
 */
public class GoodsInfoDaoImpl implements GoodsInfoDao {
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    private Connection conn = null;

    //创建数据库连接
    @Override
    public void getConnection() {
        try {
            Class.forName(ReadXml.getDriver());
            conn = DriverManager.getConnection(ReadXml.getConnection(),ReadXml.getAccount(),ReadXml.getPasswd());
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
    public void add(String string, Object[] objects) {
        getConnection();
        try {
            pst = conn.prepareStatement(string);
            for(int i = 0;i<objects.length;i++){
                pst.setObject(i+1,objects[i]);
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
    }
    //删除数据
    @Override
    public void delete(String string, Object[] objects) {
        getConnection();
        try {
            pst = conn.prepareStatement(string);
            for(int i = 0;i<objects.length;i++){
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
    }
    //更新数据
    @Override
    public void update(String string, Object[] objects) {
        getConnection();
        try {
            pst = conn.prepareStatement(string);
            for(int i = 0;i<objects.length;i++){
                pst.setObject(i+1,objects[i]);
            }
            int num = pst.executeUpdate();
            if(num>0){
                System.out.println("更新成功！");
            }else {
                System.out.println("更新失败@");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
