package com.icss.test.homework4.salecar;

import java.util.Scanner;

/**
 * Created by 29185 on 2017/5/25.
 */
public class SaleCar {
    public static void main(String [] args){
        Saler saler = new Saler("张三");
        System.out.println("*******************欢迎登录汽车销售界面******************");
        System.out.println("请输入销售方式：\t\t\t1.按数量销售\t\t2.按类型和数量销售");
        Scanner sn = new Scanner(System.in);
        int type = sn.nextInt();
        switch (type){
            case 1:
                System.out.println("请输入数量:");
                saler.typeOne(sn.nextInt());
                break;
            case 2:
                System.out.println("请输入数量:");
                int num = sn.nextInt();
                System.out.println("请输入类型:");
                String style = sn.next();
                saler.typeTwo(style,num);
                break;
            default:
                break;
        }


    }
}
