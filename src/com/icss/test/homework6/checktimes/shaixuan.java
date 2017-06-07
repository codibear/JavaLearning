package com.icss.test.homework6.checktimes;

import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/6.
 */

public class shaixuan {
    private static final String String = null;

    public static void main(String[] args) {

        //	String str="你好";
        //String s=str.substring(1,2);
        //System.out.println(s);
        //输入并获取字符串
        System.out.print("请输入一个字符串：");
        Scanner input=new Scanner(System.in);
        String str=input.next();
        String[] sx=new String[str.length()];
	/*	for(int i=0;i<str.length();i++){



		//把字符串拆分成字符
			String s=str.substring(i,i+1);
			System.out.println(s);
		}*/
        //char s=str.charAt(i);
        //输入并获取要查询的字符串
        //sx[i]=(String)s;
        System.out.print("请输入要查找的字符：");
        Scanner input1=new Scanner(System.in);
        String  str1=input.next();

        //定义一个数来统计要查询字符出现次数
        int account=0;
        for(int j=0;j<str.length();j++){
            for(int i=0;i<str.length();i++){



                //把字符串拆分成字符
                String s=str.substring(i,i+1);
                //System.out.println(s);

                if(str1.equals(s)){
                    account=account+1;

                }
            }
            System.out.println(str+"   中包含"+account+"个"+"“"+str1+"”。");
            break;

        }

    }
}