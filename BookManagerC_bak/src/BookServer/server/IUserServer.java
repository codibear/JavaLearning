package BookServer.server;

import BookServer.po.Book;
import BookServer.po.User;

/**
 * Created by 29185 on 2017/6/15.
 */
public interface IUserServer {
    boolean findUserByUsernameAndPwd(String username,String pwd);

}
