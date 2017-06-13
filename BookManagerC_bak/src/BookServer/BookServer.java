package BookServer;

import jdk.internal.util.xml.impl.Input;
import po.Book;
import po.FlagAndData;
import po.User;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

/**
 * Created by 29185 on 2017/6/12.
 */

public class BookServer {
    private static List list;
    private static List listDelete;
    private static List listChange;
    public static void main(String[] args) {

        try {
            //创建接受套接字
            ServerSocket ss = new ServerSocket(9999);
            while (true) { //while需要写在Socket后面
                //启动
                Socket s = ss.accept();
                //接受对象数据 ois
                ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
                //从客户端读入数据 FlagAndData 类型
                //这个数据一直在和服务器交互，所以不要在外面强制转换，通过flag判断操作，再进行转换
                FlagAndData flagAndData = (FlagAndData) ois.readObject();//问：在下面另起一行直接写ois去作为数据行不行
//-------------------------------------------------------------------------------------------------------------------------------
                //发送对象数据 oos
               // ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());在这里写有错，哪用在哪写；
                //flag
                int flag = flagAndData.getFlag();

                if (flag == 0) {
                    //这里要一步一步的去转化，因为得到的是一个List数组里表
                    List list = flagAndData.getArrayList();
                    /**
                     * ------------------这里要写get()才能类型转换
                     */
                    User user = (User) list.get(0);
                    if (user.getName().equals("zzx") && user.getPwd().equals("123")) {
                        System.out.println("登录成功！");
                        flag = 0;
                    } else {
                        System.out.println("登录失败！");
                    }
                }
                //添加
                if(flag==1){
                    list = flagAndData.getArrayList();
                    for(Object v:list){
                        System.out.println(((Book)v).getName());
                    }
                    //问：如何多次存储，读取都不会有冲突？
                }
                //查看
                if(flag==2){
                    ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
                    oos.writeObject(list);
                }
                //删除
                if(flag==3){
                    listDelete = flagAndData.getArrayList();
                    Book book = (Book) listDelete.get(0);
                    for(Object v:list){
                        if(((Book)v).getId()==(book.getId())){
                            list.remove(v);
                            break;
                        }
                    }
                    ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
                    oos.writeObject(list);
                }
                //更改
                if (flag==4){
                    listChange = flagAndData.getArrayList();
                    Book book = (Book) listChange.get(0);
                    for(Object v:list){
                        if(((Book)v).getId()==(book.getId())){
                            int num = list.indexOf(v);
                            list.set(num,book);
                            break;
                        }
                    }
                    ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
                    oos.writeObject(list);
                }
                OutputStream os = s.getOutputStream();
                //最后把flag数据返回作为，客户端显示的依据
                os.write(flag);
                System.out.println("以输出");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
