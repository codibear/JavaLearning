package BookServer.server;

import BookServer.po.Book;

import java.sql.ResultSet;

/**
 * Created by 29185 on 2017/6/15.
 */
public interface IBookServer {
    int addBook(Book book);
    int setBook(Book book);
    int removeBook(Book book);
    ResultSet findBook(Book book);
}
