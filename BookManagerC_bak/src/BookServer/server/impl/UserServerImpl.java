package BookServer.server.impl;

import BookServer.dao.IUserDao;
import BookServer.dao.impl.UserImplDao;
import BookServer.po.Book;
import BookServer.po.User;
import BookServer.server.IUserServer;

/**
 * Created by 29185 on 2017/6/15.
 */
public class UserServerImpl implements IUserServer {
    UserImplDao userImplDao = new UserImplDao();
    User u = new User();
    Book b = new Book();
    @Override
    public boolean findUserByUsernameAndPwd(String username, String pwd) {
        String sql = "select * from user where username=? and pwd = ?";
        u.setPwd(pwd);
        u.setName(username);
        User user = userImplDao.selectUserByUsernameAndPwd(sql,u);
        if(user.getPwd()==null||user.getName()==null){
            return false;
        }else {
            return true;
        }
    }


}
