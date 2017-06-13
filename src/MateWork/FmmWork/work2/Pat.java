package com.fmm.work2;

import java.io.Serializable;

/**
 * @author vera
 *宠物类
 */
public class Pat implements Serializable{
	//属性：昵称，种类，主人
	private String name;
	private String kinds;
	private String host;
	//get set 方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKinds() {
		return kinds;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	@Override
	public String toString() {
		return "您好！@^-^@我的名字是" + name + ", 我是一只" + kinds + "。我的主人是" + host+"。";
	}
	
}
