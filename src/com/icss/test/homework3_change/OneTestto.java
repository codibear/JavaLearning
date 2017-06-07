package com.icss.test.homework3_change;

import java.util.Scanner;

/**
 * Created by 29185 on 2017/5/25.
 */
public class OneTestto {
    public static void main(String [] args){
        int length = 4;
        System.out.println("选举开始！节目代号及类型名称如下：");
        String [] names = {"小品","独唱","舞蹈","杂技"};
        String [] ids = {"x","d","w","z"};
        JIeMu [] jIeMus = new JIeMu[length];
        for (int i=0;i<jIeMus.length;i++){
            //通过构造函数为数组传递数值
            jIeMus[i] = new JIeMu(names[i],ids[i]);
        }
        //对传递到对象数组的值尽享遍历并输出
        for (JIeMu a:jIeMus) {
            a.showMsg(1);
        }
        Scanner sn = new Scanner(System.in);
        while (true){
            System.out.println("请输入您喜欢的节目代号（输入e结束）：");
            String n = sn.next();
            //下面没想出
            if("e".equalsIgnoreCase(n)){
                System.out.println("选票结束！");
                break;
            }
            // 用else有缺陷，会在不是本次数组中匹配的字母也退出
            int flag = 0;
            for (JIeMu a:jIeMus) {
                if(a.isSameCode(n)){
                    a.addTicket();
                    flag = 1;
                    break;
                }
            }
            if (flag==0){
                System.out.println("选票无效请重新输入！");
            }
        }
        //排序
        for (int i = 0;i<length-1;i++){
            for(int j = 0;j<length-i-1;j++){
                if(jIeMus[j].getTicket()<jIeMus[j+1].getTicket()){
                    JIeMu temp = jIeMus[j];
                    jIeMus[j]  = jIeMus[j+1];
                    jIeMus[i] = temp;
                }
            }
        }
        //进行数组的输出（由大到小）
        for (JIeMu a:jIeMus) {
           a.showMsg(2);
        }
        jIeMus[0].showMsg(3);
    }
}
