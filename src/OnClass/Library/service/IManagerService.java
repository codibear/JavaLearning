package OnClass.Library.service;

import OnClass.Library.po.Books;

/**
 * Created by 29185 on 2017/6/1.
 */
public interface IManagerService {
    public boolean login(String account, String password);
    public void setInfo(Books[] books);
    public void checkBookType(Books [] books);
    public void checkBookTypeInfo(Books [] books,String type);
    public void setBookNum(Books [] books,int bookId, int bookNum);
    public void modifyInfo(Books [] books,int bookId);
}
