package com.icss.test.homework5.com.zzx.impl;

import com.icss.test.homework5.com.zzx.po.Student;

import java.util.Scanner;



public interface IStudentService {

	//成绩录入
	public abstract void luru(Student[] st, Scanner input);
	//成绩排序
	public abstract void cjpx(Student[] st);
	//成绩输出
	public abstract void outputcj(Student[] st);
	//输出最高分
	public abstract void gethigh(Student[] st);
	//输出最低分
	public abstract void getlow(Student[] st);
	//求总成绩
	public abstract void allsum(Student[] st);
	//求平均分
	public abstract void avgcj(Student[] st);
}
