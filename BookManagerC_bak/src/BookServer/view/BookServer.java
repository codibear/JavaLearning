package BookServer.view;

import BookServer.po.Book;
import BookServer.po.FlagAndData;
import BookServer.po.User;
import BookServer.server.impl.BookServerImpl;
import BookServer.server.impl.UserServerImpl;

import javax.xml.transform.Result;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 29185 on 2017/6/12.
 */

public class BookServer {
    private static List list;
    private static List listDelete;
    private static List listChange;
    private static List listCheck;
    private static UserServerImpl userServer = new UserServerImpl();
    private static BookServerImpl bookServer = new BookServerImpl();
    public static void main(String[] args) {

        try {
            //创建接受套接字
            ServerSocket ss = new ServerSocket(9999);
            while (true) {
                Socket s = ss.accept();
                //接受对象数据 ois
                ObjectInputStream ois = new ObjectInputStream(s.getInputStream());

                FlagAndData flagAndData = (FlagAndData) ois.readObject();

                int flag = flagAndData.getFlag();

                if (flag == 0) {

                    List list = flagAndData.getArrayList();
                    User user = (User) list.get(0);

                    boolean b = userServer.findUserByUsernameAndPwd(user.getName(),user.getPwd());
                    if(b==true){
                        System.out.println("登录成功！");
                        flag = 0;
                    }else {
                        System.out.println("登录失败！");
                        flag=-1;
                    }
                }
                //添加
                if(flag==1){
                    list = flagAndData.getArrayList();
                    for(Object v:list){
                        Book book = (Book)v;
                        int num = bookServer.addBook(book);
                        if(num>0){
                            System.out.println("插入成功！");
                        }else {
                            System.out.println("插入失败@");
                        }
                        System.out.println(book.getName());
                    }
                }
                //查看
                if(flag==2){
                    List<Book> selectBook = new ArrayList<>();
                    listCheck= flagAndData.getArrayList();
                    Book book = (Book) listCheck.get(0);
                    ResultSet rs = bookServer.findBook(book);
                    try {
                        while (rs.next()) {
                            book.setName(rs.getString("bookname"));
                            book.setId(rs.getInt("bookid"));
                        }
                        selectBook.add(book);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                    ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
                    oos.writeObject(selectBook);
                }
                //删除
                if(flag==3){
                    listDelete = flagAndData.getArrayList();
                    Book book = (Book) listDelete.get(0);
                    int num = bookServer.removeBook(book);
                    //--------------
                    if(num>0){
                        System.out.println("删除成功！");
                    }else {
                        System.out.println("删除失败@");
                    }
                   /* for(Object v:list){
                        if(((Book)v).getId()==(book.getId())){
                            list.remove(v);
                            break;
                        }
                    }*/
                    ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
                    oos.writeObject(listDelete);
                }
                //更改
                if (flag==4){
                    listChange = flagAndData.getArrayList();
                    Book book = (Book) listChange.get(0);
                    int num = bookServer.setBook(book);
                    //--------------
                    if(num>0){
                        System.out.println("更改成功！");
                    }else {
                        System.out.println("更改失败@");
                    }

                   /* for(Object v:list){
                        if(((Book)v).getId()==(book.getId())){
                            int num = list.indexOf(v);
                            list.set(num,book);
                            break;
                        }
                    }*/
                    ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
                    oos.writeObject(listChange);
                }
                OutputStream os = s.getOutputStream();
                //最后把flag数据返回作为，客户端显示的依据
                os.write(flag);
                System.out.println("向客户端传递成功！");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
