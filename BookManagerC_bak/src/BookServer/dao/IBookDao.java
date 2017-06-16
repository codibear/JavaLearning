package BookServer.dao;

import BookServer.po.Book;

import java.sql.ResultSet;

/**
 * Created by 29185 on 2017/6/15.
 */
public interface IBookDao {
    int insertBook(String sql,Book book);
    int updateBook(String sql,Book book);
    int deleteBook(String sql,Book book);
    ResultSet selectBook(String sql,Book book);
}
