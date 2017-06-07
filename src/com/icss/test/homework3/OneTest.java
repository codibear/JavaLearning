package com.icss.test.homework3;

import java.util.Scanner;

/**
 * Created by 29185 on 2017/5/24.
 */
class OneTest {
    public static void main(String [] args){
        System.out.println("选举开始！节目代号及类型名称如下：\n"+"X : 小品\n"+"D ：独唱\n" +"W ：舞蹈\n" + "Z ：杂技\n");
        JieMu [] jieMus = new JieMu[4];
        JieMu jieMu1 = new JieMu();
        JieMu jieMu2 = new JieMu();
        JieMu jieMu3 = new JieMu();
        JieMu jieMu4 = new JieMu();
        boolean flag = true;
        while(flag){
            Scanner input = new Scanner(System.in);
            System.out.println("请输入您喜欢的节目代号（输入E结束）：");
            String touPiao = input.nextLine();
            switch (touPiao){
                case "X":
                    jieMu1.setX(1);
                    jieMus [0]= jieMu1;
                    break;
                case "W":
                    jieMu2.setW(1);
                    jieMus [1]= jieMu2;
                    break;
                case "D" :
                    jieMu3.setD(1);
                    jieMus [2]= jieMu3;
                    break;
                case "Z":
                    jieMu4.setZ(1);
                    jieMus [3]= jieMu4;
                    break;
                case "E":
                    flag = false;
                    break;
                    default:
                        System.out.println("此选票无效，请输入正确的节目代号！");
                        break;
            }

        }
        System.out.println("小品 ： "+jieMus[0].getX());
        System.out.println("独唱 ： "+jieMus[2].getD());
        System.out.println("舞蹈 ： "+jieMus[1].getW());
        System.out.println("杂技 ： "+jieMus[3].getZ());

       /* System.out.println("小品 ： "+jieMus[0].getX());
        System.out.println("独唱 ： "+jieMus[1].getD());
        System.out.println("舞蹈 ： "+jieMus[2].getW());
        System.out.println("杂技 ： "+jieMus[3].getZ());*/
    }

}
