package OnClass.Library.Impl;

import OnClass.Library.po.Books;
import OnClass.Library.service.IManagerService;
import OnClass.Library.util.BookService;

import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/1.
 */
public class ManagerServiceImpl implements IManagerService {
    //验证登录信息
    @Override
    public boolean login(String account, String password) {
        if(account.equals("zzx")&&password.equals("123")) {
            System.out.println("登录成功！");
            return false;
        }else{
            System.out.println("请重新输入！！！");
            return true;
        }
    }
    //增添图书方法
    @Override
    public void setInfo(Books [] books) {
        Scanner input = new Scanner(System.in);

        for(int i = 0;i<books.length;i++) {
            Books books1 = Books.getInstance();//对象我必须
            System.out.println("请输入书号：");
            books1.setBookId(input.nextInt());
            System.out.println("请输入书名：");
            books1.setName(input.next());
            System.out.println("请输入图书类型：");
            books1.setType(input.next());
            System.out.println("请输入图书数量：");
            books1.setNum(input.nextInt());
            books[i] = books1;
            System.out.println(i);
        }
        System.out.println("录入完毕！");

    }
    //查询图书类型
    @Override
    public void checkBookType(Books[] books) {
        for (Books  b:books) {
            System.out.println("图书的各个类型为："+b.getType());
        }
    }
    //查看图书类型下的信息
    @Override
    public void checkBookTypeInfo(Books [] books,String type) {
        int flag = 0;
        for(int i = 0 ; i<books.length;i++){
            if((books[i].getType()).equals(type)){
                BookService.display(books[i],1);
                flag = 1;
                continue;

            }
        }if(flag==0){
            System.out.println("您输入的图书不存在");
        }
    }
    //增删图书的数量
    @Override
    public void setBookNum(Books [] books,int bookId, int bookNum) {
        int flag = 0;
        for (int i = 0 ; i<books.length;i++){
            if(bookId == books[i].getBookId()){
                books[i].setNum(bookNum);
                flag = 1;
                break;
            }
        }
        if (flag==0){
            System.out.println("您输入的图书不存在");
        }else {
            System.out.println("增添/删除完成");
        }

    }
    //修改图书信息
    @Override
    public void modifyInfo(Books [] books,int bookId) {
        Scanner input = new Scanner(System.in);
        Books books1 = Books.getInstance();
        int flag = 0;
        for(int i = 0 ; i<books.length;i++){
            if(bookId==books[i].getBookId()){
                System.out.println("请输入书号：");
                books1.setBookId(input.nextInt());
                System.out.println("请输入书名：");
                books1.setName(input.next());
                System.out.println("请输入图书类型：");
                books1.setType(input.next());
                System.out.println("请输入图书数量：");
                books1.setNum(input.nextInt());
                books[i] = books1;
                flag = 1;
                break;
            }

        }
        if(flag==0){
            System.out.println("您输入的图书不存在");
        }else {
            System.out.println("修改成功！");
        }
    }
}
