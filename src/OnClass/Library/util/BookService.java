package OnClass.Library.util;

import OnClass.Library.po.Books;

/**
 * Created by 29185 on 2017/6/1.
 */
public class BookService {
    public static void display(Books books, int chekck){
        switch (chekck){
            case 1:
                    System.out.println(" 书号："+books.getBookId()+" 书名："+books.getName()+" 类型："+books.getType()+" 数量："+books.getNum());
                break;
        }
    }
}
