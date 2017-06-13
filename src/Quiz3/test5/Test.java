package Quiz3.test5;

import Quiz3.test4.Person;

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
        File file1 = new File("E:/pet.txt");
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
        try {
            FileWriter fw = new FileWriter(file1);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("您好！\n" +
                    "我的名字是{name}，我是一只{type}。\n" +
                    "我的主人是{master}。");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
