package com.lhr.po;

public class User {
	//用户名
	private String name;
	//构造方法
	public User(String name) {
		super();
		this.name = name;
	}

	public User() {
		super();
	}
	//get set 方法

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
