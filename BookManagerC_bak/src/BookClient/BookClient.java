package BookClient;

import po.Book;
import po.FlagAndData;
import po.User;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/12.
 */
public class BookClient {
    public static BookClient bookClient = new BookClient();
    FlagAndData flagAndData = new FlagAndData();
    public static void main(String[] args) {

            try {
                //建立一个套接字
                Socket socket = new Socket("127.0.0.1",9999);
                while (true){
                        //准备写出数据，传到服务器
                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                    //接受flag数据，做出相应的操作

                    //正式登录
                    FlagAndData userPass = bookClient.login();
                    oos.writeObject(userPass);
                    System.out.println("客户端传出成功！");
                    /**
                     * 需要注意的是下面的接受数据只要写在前面客户端就会一直等待
                     */
                    InputStream is = socket.getInputStream();
                    int flag =0;
                    flag = is.read();
                    if(flag==0) {
                        System.out.println("登录成功！");
                        show();
                        break;
                    }else {
                        continue;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
    //选项显示
    public static void show() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入想执行的操作\n1.录入图书信息\n2.查看图书信息\n3.删除图书信息\t4.更改图书信息");
            int num = scanner.nextInt();
            switch (num) {
                case 1:
                    Socket socket = null;
                    try {
                        socket = new Socket("127.0.0.1", 9999);
                        //准备写出数据，传到服务器
                        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                        FlagAndData flagAndData = addBook();
                        oos.writeObject(flagAndData);
                        oos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    checkBook();
                    break;
                case 3:
                    deleteBook();
                    break;
                case 4:
                    changeBook();
                    break;
            }
        }
    }
    public FlagAndData login(){
        FlagAndData flagAndData = new FlagAndData();
        Scanner input = new Scanner(System.in);
        //注册功能，建立用户实体
        User user = new User();
        System.out.println("欢迎来到登录界面！");
        System.out.println("请输入用户名：");
        user.setName(input.next());
        System.out.println("请输入密码：");
        user.setPwd(input.next());
        List userList = new ArrayList();
        userList.add(user);
        flagAndData.setFlag(0);
        flagAndData.setArrayList(userList);
        return flagAndData;
    }
    public static FlagAndData addBook(){
        FlagAndData flagAndData = new FlagAndData();
        List bookList = new ArrayList();
        while (true) {

            Scanner input = new Scanner(System.in);
            //注册功能，建立用户实体
            Book book = new Book();
            System.out.println("录入图书：");
            System.out.println("请输入图书名：");
            book.setName(input.next());
            System.out.println("请输入图书编号：");
            book.setId(input.nextInt());
            bookList.add(book);
            flagAndData.setFlag(1);
            flagAndData.setArrayList(bookList);
            System.out.println("是否继续输入  Y/N");
            if(input.next().equalsIgnoreCase("n")){
                break;
            }else {
                continue;
            }
        }
        return flagAndData;
    }
    public static void checkBook(){
        FlagAndData flagAndData = new FlagAndData();
        flagAndData.setFlag(2);

        try {
            Socket socket = new Socket("127.0.0.1",9999);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(flagAndData);

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            List list = (List) ois.readObject();
            for(Object o:list){
                System.out.println("图书编号："+((Book)o).getId()+"-----------图书名："+((Book)o).getName());
            }
            ois.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void changeBook(){
        FlagAndData flagAndData = new FlagAndData();
        List bookList = new ArrayList();
        Book book = new Book();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要修改的图书编号：");
        book.setId(input.nextInt());
        System.out.println("请输入修改后的图书名：");
        book.setName(input.next());

        flagAndData.setFlag(4);
        bookList.add(book);
        flagAndData.setArrayList(bookList);

        try {
            Socket socket = new Socket("127.0.0.1",9999);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(flagAndData);

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            List list = (List) ois.readObject();
            for(int i = 0 ; i<list.size();i++){
                Book book1 = (Book) list.get(i);
                System.out.println("图书编号："+book1.getId()+"-----------图书名："+book1.getName());
            }
           /* for(Object o:list){
                System.out.println(((Book)o).getId()+"-----------"+((Book)o).getName());
            }*/
            ois.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void deleteBook(){
        FlagAndData flagAndData = new FlagAndData();
        List bookList = new ArrayList();
        Book book = new Book();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入图书编号：");
        book.setId(input.nextInt());
        flagAndData.setFlag(3);
        bookList.add(book);
        flagAndData.setArrayList(bookList);

        try {
            Socket socket = new Socket("127.0.0.1",9999);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(flagAndData);

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            List list = (List) ois.readObject();
            for(Object o:list){
                System.out.println("图书编号："+((Book)o).getId()+"-----------图书名："+((Book)o).getName());
            }
            ois.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

}
