package com.icss.test.homework3_change;

import java.util.Scanner;

/**
 *
 * Created by 29185 on 2017/5/25.
 */
public class Capsule {
    private int length;
    private String [] names;
    private String [] ids;
    private JIeMu [] jIeMus;

    //初始化
    public void init(){
        this.length = 4;
        //这个数组必须new才能行，否则会报错
        this.names = new String [] {"小品","独唱","舞蹈","杂技"};
        this.ids = new String [] {"x","d","w","z"};
        jIeMus = new JIeMu[length];
        for(int i = 0;i< jIeMus.length;i++){
            jIeMus[i] = new JIeMu(names[i],ids[i]);
        }
    }
    public void show(){
        System.out.println("选举开始，节目代号以及类型名称如下：");
        for (JIeMu a:jIeMus) {
            a.showMsg(1);
        }
    }
    public void select(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请输入您喜欢的节目代号（输入e结束）：");
            String n = scanner.next();
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
        System.out.println("over!");
    }
    public void sort(){
        for (int i = 0;i<length-1;i++){
            for(int j = 0;j<length-i-1;j++){
                if(jIeMus[j].getTicket()<jIeMus[j+1].getTicket()){
                    JIeMu temp = jIeMus[j];
                    jIeMus[j]  = jIeMus[j+1];
                    jIeMus[i] = temp;
                }
            }
        }
        for (JIeMu a:jIeMus) {
            a.showMsg(2);
        }
        jIeMus[0].showMsg(3);
    }
    public void start(){
        init();
        show();
        select();
        sort();
    }

}
