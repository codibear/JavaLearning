package com.icss.test.homework8.test3.test;

import com.icss.test.homework8.test3.service.BuyServiceImpl;
import com.icss.test.homework8.test3.util.MyArrayList;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/7.
 */
public class Test {
    static File saveFile = new File("E:/tmp2/save.bin");;
    public static void main(String[] args) {
        BuyServiceImpl buyService = new BuyServiceImpl();
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        MyArrayList arrayList = new MyArrayList();
        File file = new File("E:/tmp2");
        File file1 = new File("E:/tmp2/save.bin");

        if(!file1.exists()){
            file.mkdirs();
            try {
                file1.createNewFile();
                System.out.println("请输入用户名：");
                String name = scanner.next();//没用
            } catch (IOException e) {
                e.printStackTrace();
            }
            while (flag) {
                //接受输入的数据
                HashMap hashMap =  buyService.init(scanner);
                arrayList.add( hashMap.get("goods"));
                if (hashMap.get("flag").equals(false)) {
                    flag = false;
                }
            }
            //循环完以后，吧数据交给save方法
            saveFile = buyService.save(arrayList,file1);
            buyService.load(saveFile);
            //以上是如果没存在时的操作
        }else {
            buyService.load(saveFile);
        }
    }
}
