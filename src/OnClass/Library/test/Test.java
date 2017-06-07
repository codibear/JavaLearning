package OnClass.Library.test;

import OnClass.Library.po.Books;
import OnClass.Library.Impl.ManagerServiceImpl;
import OnClass.Library.service.MyException;

import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/1.
 */
public class Test {
    public static void main(String[] args) {
        Books[] books=null;
        Scanner input = new Scanner(System.in);
        System.out.println("******************欢迎进入图书馆登陆界面***********************");
        ManagerServiceImpl m = new ManagerServiceImpl();
        //验证登录信息
        boolean flag = true;
        while (flag) {
            System.out.println("请输入您的账号：");
            String accout = input.next();
            System.out.println("请输入您的密码：");
            String password = input.next();
            boolean check = m.login(accout, password);
            if (check == false) {
                flag = false;
            }
        }

        boolean finish = true;
        while (finish) {
            System.out.println("******************欢迎进入图书馆管理系统***********************");
            System.out.println("1.录入图书\n2.查询类型\n3.查看图书类型下的图书信息\n4.增加或删除某个图书的数量\n5.修改图书信息\n6.退出");
            System.out.println("请输入您的操作：");
            int load = input.nextInt();
            switch (load) {
                //增添图书
                case 1:
                    System.out.println("请输入您想要录入的图书的数量：");
                    int num = input.nextInt();
                    try{
                        if (num>2) {
                            throw new MyException("chucuole");
                        }
                    } catch (MyException e) {
                        e.printStackTrace();
                    }

                    books = new Books[num];
                    m.setInfo(books);
                    break;
                //查询图书类型
                case 2:
                    m.checkBookType(books);
                    break;
                case 3:
                    System.out.println("请输入查找类型");
                    String type = input.next();
                    m.checkBookTypeInfo(books, type);
                    break;
                case 4:
                    System.out.println("提示：如果想删除请把值改为负数!");
                    System.out.println("请输入要改的图书编号：");
                    int bookId = input.nextInt();
                    System.out.println("请输入增添或删减的数量");
                    int bookNum = input.nextInt();
                    m.setBookNum(books,bookId,bookNum);
                    break;
                case 5:
                    System.out.println("请输入要改的图书编号：");
                    int bookid = input.nextInt();
                    m.modifyInfo(books,bookid);
                    break;
                case 6:
                    finish = false;
                    break;
                default:
                    break;
            }
        }
    }
}
