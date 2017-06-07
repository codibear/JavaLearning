package com.icss.test.homework4.pet;

import java.util.Scanner;

/**
 * Created by 29185 on 2017/5/25.
 */
public class Grow {
    public static void main(String [] args){
        System.out.println("*********欢迎来到从宠物站***********");
        System.out.println("请输入要领养的宠物名字：");
        Dog dog;
        Penguin penguin;

        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("请选择要领养的宠物类型（1. 狗狗\t\t2.企鹅）：");
        int type = input.nextInt();
        if(type==1){
            dog = new Dog();
            System.out.println("请选择狗的品种（1.聪明的拉布拉多\t2.酷酷的雪纳瑞：）");
            int type2 = input.nextInt();
        } else if(type==2){
            penguin = new Penguin();
        }else {
            System.out.println("您输入的有误！");
        }



    }
}
