package com.lhr.po;

import java.io.Serializable;

public class Product extends User  implements Serializable{
	//��Ʒ��
	private int proId;
	//����
	private String proName;
	//����
	private int proNum;
	//����
	private  double proPrice;
	//���췽��
	public Product() {
		super();
	}
	//get set ����
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public int getProNum() {
		return proNum;
	}
	public void setProNum(int proNum) {
		this.proNum = proNum;
	}
	public double getProPrice() {
		return proPrice;
	}
	public void setProPrice(double proPrice) {
		this.proPrice = proPrice;
	}
	@Override
	public String toString() {
		return  proId + "                  " + proName + "                " + proNum + "                  " + proPrice;
	}
	
}
