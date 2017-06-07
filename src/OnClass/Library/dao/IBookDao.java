package OnClass.Library.dao;

import OnClass.Library.po.Books;

/**
 * Created by 29185 on 2017/6/5.
 */
public interface IBookDao {
    void add(Books b);
    void delete(Books b);
    void update(Books b);
}
