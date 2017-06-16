package BookServer.server.impl;

import BookServer.dao.impl.BookImplDao;
import BookServer.po.Book;
import BookServer.server.IBookServer;

import java.sql.ResultSet;

/**
 * Created by 29185 on 2017/6/15.
 */
public class BookServerImpl implements IBookServer {
    BookImplDao bookImplDao = new BookImplDao();

    @Override
    public int addBook(Book book) {
        String sql = "insert into book(bookname,bookid)values(?,?)";
        int num = bookImplDao.insertBook(sql,book);
        return num;
    }

    @Override
    public int setBook(Book book) {
        String sql = "update book set bookname = ? where bookid = ?";
        int num = bookImplDao.updateBook(sql,book);
        return num;
    }

    @Override
    public int removeBook(Book book) {
        String sql = "delete from book where bookid = ?";
        int num = bookImplDao.deleteBook(sql,book);
        return num;
    }

    @Override
    public ResultSet findBook(Book book) {
        ResultSet rs = null;
        if(book==null){
            String sql = "select * from book";
            rs = bookImplDao.selectBook(sql,null);
        }else {
            String sql = "select * from book where bookname=?";
            rs = bookImplDao.selectBook(sql,book);
        }
        return rs;
    }
}
