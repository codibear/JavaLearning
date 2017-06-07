package com.icss.test.homework7.test5.test;

import com.icss.test.homework7.test5.po.Pet;
import com.icss.test.homework7.test5.service.PetServiceIpml;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/6.
 */
public class Test {
    public static void main(String[] args) {
        Pet pet1 = new Pet("小白","狗");
        Pet pet2 = new Pet("小红","猪");
        Pet pet3 = new Pet("小蓝","鸡");
        Pet pet4 = new Pet("小绿","猫");

        List arrayList = new ArrayList();
        arrayList.add(pet1);
        arrayList.add(pet2);
        arrayList.add(pet3);
        arrayList.add(pet4);

        System.out.println("请输入您要查找的宠物名称：");
        Scanner scanner = new Scanner(System.in);
        Pet temp = new Pet();
        temp.setName(scanner.next());
        new PetServiceIpml().check((ArrayList) arrayList,temp);
    }
}
