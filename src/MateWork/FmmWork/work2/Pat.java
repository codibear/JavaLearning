package com.fmm.work2;

import java.io.Serializable;

/**
 * @author vera
 *������
 */
public class Pat implements Serializable{
	//���ԣ��ǳƣ����࣬����
	private String name;
	private String kinds;
	private String host;
	//get set ����
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
		return "���ã�@^-^@�ҵ�������" + name + ", ����һֻ" + kinds + "���ҵ�������" + host+"��";
	}
	
}
