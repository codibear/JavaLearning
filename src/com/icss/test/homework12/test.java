package com.icss.test.homework12;

import com.icss.test.homework12.impl.GoodsInfoDaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by 29185 on 2017/6/14.
 */
public class test {
    static ResultSet rs = null;
    public static void main(String[] args) {
        GoodsInfoDaoImpl dao = new GoodsInfoDaoImpl();
        //添加数据
        String sql = "insert into goodsinfo(goods_id,goods_name,type_id) values(?,?,?)";
        Object [] objects = {"1003-XYJ-001","海尔洗衣机",6};
        dao.add(sql,objects);
        dao.closeConnection();

        //更改数据
        String sql1 = "update goodsinfo set goods_name =? where type_id=?";
        Object [] objects1 = {"格力洗衣机",6};
        dao.update(sql1,objects1);
        dao.closeConnection();

        //查询数据
        String sql2 = "select * from goodsinfo where type_id=?";
        Object [] objects2 = {1};
        rs = dao.select(sql2,objects2);
        try {
            while(rs.next()) {
                int id = rs.getInt("type_id");
                String gname = rs.getString("goods_name");
                String gid = rs.getString("goods_id");
                System.out.println(id+"\t"+gname+"\t"+gid);
            }

            dao.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //删除数据
        String sql3 = "delete from goodsinfo where goods_id = ?";
        Object [] objects3 = {"1003-XYJ-001"};
        dao.delete(sql3,objects3);
        dao.closeConnection();
    }
}
