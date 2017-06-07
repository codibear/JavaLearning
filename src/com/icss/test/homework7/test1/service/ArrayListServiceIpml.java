package com.icss.test.homework7.test1.service;

import com.icss.test.homework7.test1.po.Dog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/6.
 */
public class ArrayListServiceIpml implements IArrayListService{

    @Override
    public ArrayList add(ArrayList arrayList, Scanner scanner) {

        boolean flag = true;
        while(flag){
            Dog dog = new Dog();
            System.out.println("请输入狗的名字");
            String name = scanner.next();
            System.out.println("请输入狗的品种");
            String type = scanner.next();
            dog.setName(name);
            dog.setType(type);
            arrayList.add(dog);
            System.out.println("输入e结束！任意键继续！");
            if (scanner.next().equalsIgnoreCase("e")){
                flag = false;
            }
        }
        return arrayList;
    }

    @Override
    public void output(ArrayList arrayList) {
        System.out.println("共计有"+(arrayList.size())+"条狗狗。\n分别是：");
        Iterator it = arrayList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
