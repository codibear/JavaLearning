package BookServer.dao.impl;

import BookServer.dao.IBookDao;
import BookServer.po.Book;
import BookServer.util.DButilImpl;

import java.sql.ResultSet;

/**
 * Created by 29185 on 2017/6/15.
 */
public class BookImplDao implements IBookDao{
    private DButilImpl dButil = new DButilImpl();

    @Override
    public int insertBook(String sql, Book book) {
        Object [] objects = {book.getName(),book.getId()};
        int num = dButil.add(sql,objects);
        dButil.closeConnection();
        return num;
    }

    @Override
    public int updateBook(String sql, Book book) {
        Object [] objects = {book.getName(),book.getId()};
        int num = dButil.update(sql,objects);
        dButil.closeConnection();
        return num;
    }

    @Override
    public int deleteBook(String sql, Book book) {
        Object [] objects = {book.getId()};
        int num = dButil.delete(sql,objects);
        dButil.closeConnection();
        return num;
    }

    @Override
    public ResultSet selectBook(String sql, Book book) {
        Object [] objects = {book.getName()};
        ResultSet rs = dButil.select(sql,objects);
        //dButil.closeConnection();
        return rs;
    }
}
