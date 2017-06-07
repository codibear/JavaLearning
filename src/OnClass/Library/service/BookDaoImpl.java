package OnClass.Library.service;

import OnClass.Library.dao.IBookDao;
import OnClass.Library.po.Books;

/**
 * Created by 29185 on 2017/6/5.
 *
 *
 */
public class BookDaoImpl implements IBookDao{



    @Override
    public void add(Books b) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("insert into Books(").append(b.getBookId()).append(",").append(b.getName()).append(",").append(b.getType())
                .append(",").append(b.getNum()).append(");");
        System.out.println(stringBuffer);
    }

    @Override
    public void delete(Books b) {

    }

    @Override
    public void update(Books b) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("alter table Student modify(").append(b.getBookId()).append(",").append(b.getName()).append(",").append(b.getType())
                .append(",").append(b.getNum()).append(");");
        System.out.println(stringBuffer);
    }

    public static void main(String[] args) {
        Books books = new Books();
        books.setName("幽游白书");
        books.setBookId(001);
        books.setType("游戏");
        books.setNum(100);

        BookDaoImpl bookDao = new BookDaoImpl();
        bookDao.add(books);
        bookDao.update(books);
    }

}
