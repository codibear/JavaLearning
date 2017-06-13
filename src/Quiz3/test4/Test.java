package Quiz3.test4;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/9.
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Person> arrayList = new ArrayList<>();
        Person personMe = new Person("zzx","123","1994-04-10",5516110);
        arrayList.add(personMe);

        File file = new File("E:/");
        File file1 = new File("E:/info.txt");
        //判读文件夹是否存在
        if(file.exists()){
            //文件夹存在文件不存在
            if(!file1.exists()){
                try {
                    file1.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else {//文件夹文件都存在

            }
        }else {//文件夹不存在
            file.mkdirs();
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("*****************欢迎光临******************");
        System.out.println("请输入操作：\t1.注册\t2.登录");
        int num = input.nextInt();
        //注册操作
        if(num==1){
                System.out.println("进入注册页面，请填写您的信息：");
                System.out.println("请输入用户名：");
                String name = input.next();
                System.out.println("请输入密码：");
                String pwd = input.next();
                System.out.println("请输入生日：");
                String birthday = input.next();
                System.out.println("请输入电话：");
                long tele = input.nextLong();
                Person person = new Person();
                person.setName(name);
                person.setPwd(pwd);
                person.setBirthday(birthday);
                person.setTele(tele);
                //如果列表中存在
                for (int i = 0;i<arrayList.size();i++) {
                    if(arrayList.get(i).getName().equals(person.getName())){
                        System.out.println("用户名重复,当前操作无效！");
                        break;
                    }else if (arrayList.get(i).getTele()<999999){
                        System.out.println("电话格式不正确！");
                    }else {
                        arrayList.add(person);
                        System.out.println("注册成功！");
                    }
                    }



            try {

                FileOutputStream fis = new FileOutputStream(file1);
                ObjectOutputStream oos = new ObjectOutputStream(fis);
                oos.writeObject(arrayList);
                oos.close();
                fis.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }catch (IOException e ){
                e.printStackTrace();
            }

        }
        else if(num==2){
            System.out.println("进入登录界面");
            System.out.println("请输入用户名：");
            String name = input.next();
            System.out.println("请输入密码：");
            String pwd = input.next();

            try {
                FileInputStream fis = new FileInputStream(file1);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Object o = ois.readObject();
                ArrayList<Person> arrayList1 = (ArrayList<Person>)o;
                for (Object ob:arrayList1){
                    if(((Person)ob).getName().equals(name)&&((Person)ob).getPwd().equals(pwd)){
                        System.out.println("登录成功！");
                        break;
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }catch (ClassNotFoundException e){
                e.printStackTrace();
            }

        }else {
            System.out.println("居然有这样的操作？");
        }
    }
}
