package com.icss.test.homework8.test2;

import java.io.*;

/**
 * Created by 29185 on 2017/6/7.
 */
public class Test{
    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.setName("小白");
        pet.setType("兔子");

        File file = new File("E:/temp");
        File file1 = new File("E:/temp/save.bin");
        //创建文件夹
        file.mkdir();
        try {
            //创建文件
            file1.createNewFile();
            //实现写出
            FileOutputStream fos = new FileOutputStream(file1);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(pet);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis = new FileInputStream(file1);
            ObjectInputStream ois = new ObjectInputStream(fis);
            System.out.println(ois.readObject());
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
