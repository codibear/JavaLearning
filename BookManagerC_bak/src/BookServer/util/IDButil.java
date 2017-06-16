package BookServer.util;

import java.sql.ResultSet;

/**
 * Created by 29185 on 2017/6/14.
 */
public interface IDButil {
    int add(String string, Object[] objects);
    int delete(String string, Object[] objects);
    int update(String string, Object[] objects);
    ResultSet select(String string, Object[] objects);
    void getConnection();
    void closeConnection();
}
