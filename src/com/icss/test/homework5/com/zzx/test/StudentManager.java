package com.icss.test.homework5.com.zzx.test;

import com.icss.test.homework5.com.zzx.impl.IStudentService;
import com.icss.test.homework5.com.zzx.po.Student;
import com.icss.test.homework5.com.zzx.service.StudentServiceImpl;

import java.util.Scanner;


/**
 *
 * @author lzc
 * @version 2017-5-24
 */
public class StudentManager {

	public static void main(String[] args) {
		System.out.println("************************");
		System.out.println("      学生成绩管理");
		System.out.println("************************");
		System.out.println("1.录入学生成绩");
		System.out.println("2.输出成绩");
		System.out.println("3.输出最高分");
		System.out.println("4.输出最低分");
		System.out.println("5.输出总成绩");
		System.out.println("6.输出平均分");
		System.out.println("7.排序");
		System.out.println("0.退出系统");
		Student[] st =new Student[5];

		while (true) {

			Scanner input =new Scanner(System.in);
			int result=input.nextInt();

			switch (result) {
				case 1:
					//多态 使用 com.icss.test.homework5.com.zzx.service.StudentService
					IStudentService s=new StudentServiceImpl();
					s.luru(st,input);
					break;
				case 2:
					IStudentService s2=new StudentServiceImpl();
					s2.outputcj(st);
					break;
				case 3:
					IStudentService s3=new StudentServiceImpl();
					s3.gethigh(st);
					break;
				case 4:
					IStudentService s4=new StudentServiceImpl();
					s4.getlow(st);
					break;
				case 5:
					IStudentService s5=new StudentServiceImpl();
					s5.allsum(st);
					break;
				case 6:
					IStudentService s6=new StudentServiceImpl();
					s6.avgcj(st);
					break;
				case 7:
					//多态 使用 com.icss.test.homework5.com.zzx.service.IStudentService
					IStudentService s7=new StudentServiceImpl();
					s7.cjpx(st);
					break;
				case 0:
					System.out.println("已退出系统！");
					break;
				default:
					break;
			}
			if(result==0){break;}
		}

	}




}

