package com.icss.test.homework5.com.zzx.po;

public class Student extends Base{
	//学号
	private String studentNum;
	//成绩
	private float cj;
	// 成绩的get set方法
	public float getCj() {
		return cj;
	}
	public void setCj(float cj) {
		this.cj = cj;
	}
	//学号的get set 方法
	public String getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	public static Student getInstance(){
		return new Student();
	}












}
