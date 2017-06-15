package com.icss.test.homework11.test2.dao;

import java.sql.ResultSet;

/**
 * Created by 29185 on 2017/6/14.
 */
public interface GoodsInfoDao {
    void add(String string,Object[] objects);
    void delete(String string,Object[] objects);
    void update(String string,Object[] objects);
    ResultSet select(String string, Object[] objects);
    void getConnection();
    void closeConnection();
}
