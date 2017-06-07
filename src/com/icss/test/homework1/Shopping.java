package com.icss.test.homework1;

import java.util.Scanner;

/**
 * Created by 29185 on 2017/5/22.
 */
public class Shopping {
    public static void main(String [] args){
        System.out.println("shopping<购物管理系统>购物结算");
        System.out.println("*********************************************");
        System.out.println("请选择您要购买的商品编号：");
        System.out.println("1.T恤\t\t2.网球鞋\t\t3.牛仔裤");
        System.out.println("*********************************************");
        boolean i = true;
        while(i){
            System.out.println("请输入商品编号：");
            Scanner name = new Scanner(System.in);
            int number = name.nextInt();

            switch (number){
                case 1:
                    System.out.println("￥260");
                    System.out.println("是否继续购买？（y/n）请选择：");
                    String charge = name.next();
                    if(charge.equals("y")){
                        break;
                    }else if(charge.equals("n")) {
                        System.out.println("程序结束");
                        i=false;
                        break ;
                    }else {
                        System.out.println("输入有误，请重新输入！");
                        break;
                    }

                case 2:
                    System.out.println("￥200");
                    System.out.println("是否继续购买？（y/n）请选择：");
                    String charge1 = name.next();
                    if(charge1.equals("y")){
                        continue;
                    }else if(charge1.equals("n")){
                        System.out.println("程序结束");
                        i = false;
                        break;
                    }else {
                        System.out.println("输入有误，请重新输入！");
                        break;
                     }
                case 3:
                    System.out.println("￥150");
                    System.out.println("是否继续购买？（y/n）请选择：");
                    String charge2 = name.next();
                    if(charge2.equals("y")){
                        continue;
                    }else if(charge2.equals("n")){
                        System.out.println("程序结束");
                        i=false;
                        break;
                    }else {
                        System.out.println("输入有误，请重新输入！");
                        break;
                    }
                    default:
                        break;
            }
        }
    }
}
