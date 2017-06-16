package BookServer.dao.impl;

import BookServer.dao.IUserDao;
import BookServer.po.Book;
import BookServer.po.User;
import BookServer.util.DButilImpl;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created by 29185 on 2017/6/15.
 */
public class UserImplDao implements IUserDao {
    private DButilImpl dButil = new DButilImpl();
    private User u = new User();




    @Override
    public User selectUserByUsernameAndPwd(String sql, User user) {
        Object [] objects = {user.getName(),user.getPwd()};
        ResultSet rs = dButil.select(sql,objects);
        try {
           while(rs.next()) {
               u.setName(rs.getString("username"));
               u.setPwd(rs.getString("pwd"));
           }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(u.getName()==null||u.getPwd()==null){
            System.out.println("用户不存在！");
        }
        return u;
    }
}
