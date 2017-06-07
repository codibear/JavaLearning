package com.icss.test.homework5.com.zzx.po;
public  abstract class Base {

	private String name;
	
	private int age;
	private String pwd;
	
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
//	public void login(Teacher t){
//		if(t.getTeacherNum().equals("t") && t.getPwd().equals("123")){
//			System.out.println("��ʦ��½�ɹ�");
//		}
//	}
//	
//	public void login2(Student s){
//		if(s.getStudentNum().equals("s") && s.getPwd().equals("123")){
//			System.out.println("ѧ����½�ɹ�");
//		}
//	}
	

	
	
	
	
}
