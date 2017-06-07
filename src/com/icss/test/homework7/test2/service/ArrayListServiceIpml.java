package com.icss.test.homework7.test2.service;

import com.icss.test.homework7.test2.po.Dog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/6.
 * 一个重要的问题：当arrayList存入Dog对象后，我怎样在另一个方法匹配arryLIst中狗的信息
 */
public class ArrayListServiceIpml implements IArrayListService {
    @Override
    public void delete(ArrayList arrayList,Scanner scanner) {
        Dog dog = new Dog();
        System.out.println("删除之前共有"+arrayList.size()+"条狗。");
        System.out.println("请输入删除的狗的名称：");
        dog.setName(scanner.next());
        /*System.out.println("请输入删除的狗的品种");
        dog.setType(scanner.next());*/
        boolean flag = false;
        boolean check = false;
        for (Object o:arrayList) {
            if((((Dog)o).getName()).equals(dog.getName())){
                arrayList.remove(o);
                flag = true;
            }
            if(((Dog) o).getName().equals("美美")){
                check = true;
            }
        }
        if(flag==true){
            System.out.println("删除之后共有"+arrayList.size()+"条狗。");
        }
        output(arrayList);
        if(check==true){
            System.out.println("其中包含美美的信息");
        }else {
            System.out.println("其中不包含美美的信息");
        }

    }

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
