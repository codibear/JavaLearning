package com.icss.test.homework5.com.zzx.service;

import com.icss.test.homework5.com.zzx.impl.IStudentService;
import com.icss.test.homework5.com.zzx.po.Student;
import com.icss.test.homework5.com.zzx.util.PxUtil;

import java.util.Scanner;

public class StudentServiceImpl implements IStudentService {

	public void cjpx(Student[] st){
		//成绩数组
		float[] cjsz={st[0].getCj(),st[1].getCj(),st[2].getCj(),st[3].getCj(),st[4].getCj()};
		PxUtil pu=new PxUtil();
		//调用排序方法
		pu.pxFromXtoD(cjsz);
	}
	public void luru(Student[] st,Scanner input){
		System.out.println("请输入成绩");
		//循环录入成绩
		for(int i=0;i<st.length;i++){
			Student s= Student.getInstance();
			float cj=input.nextFloat();
			s.setCj(cj);
			st[i]=s;
		}
		System.out.println("录入完毕");
	}
	//成绩输出
	public void outputcj(Student[] st){
		System.out.println("當前成绩为：");
		for (Student  v:st) {
			System.out.println(v.getCj());
		}

	}
	//输出最高分
	public void gethigh(Student[] st){
		System.out.print("最高分为：");
		float[] cjsz={st[0].getCj(),st[1].getCj(),st[2].getCj(),st[3].getCj(),st[4].getCj()};
		PxUtil sum2=new PxUtil();
		sum2.gethigh(cjsz);

	}
	//输出最低分
	public void getlow(Student[] st){
		System.out.print("最低分为：");
		float[] cjsz={st[0].getCj(),st[1].getCj(),st[2].getCj(),st[3].getCj(),st[4].getCj()};
		PxUtil sum3=new PxUtil();
		sum3.getlow(cjsz);
	}
	//求总成绩
	public void allsum(Student[] st){
		System.out.print("总成绩为：");
		float[] cjsz={st[0].getCj(),st[1].getCj(),st[2].getCj(),st[3].getCj(),st[4].getCj()};
		PxUtil sum1=new PxUtil();
		sum1.allsum(cjsz);
	}
	//求平均分
	public void avgcj(Student[] st){
		System.out.print("平均分为：");
		float[] cjsz={st[0].getCj(),st[1].getCj(),st[2].getCj(),st[3].getCj(),st[4].getCj()};
		PxUtil avg1=new PxUtil();
		avg1.avgcj(cjsz);
	}
}

