package com.fmm.work3;

import java.io.Serializable;

import javax.sql.rowset.serial.SerialArray;

/**
 * @author vera
 *������
 */
public class OrderPay implements Serializable{
	//���ԣ��û�������Ʒ�ţ���Ʒ�������ۣ�����
	private String userName;
	private String goodsNo;
	private String goodsName;
	private double price;
	private int num;
	
	//get set����
	public String getGoodsName() {
		return goodsName;
	}
	public String getGoodsNo() {
		return goodsNo;
	}
	public void setGoodsNo(String goodsNo) {
		this.goodsNo = goodsNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	//��дtoString����
	@Override
	public String toString() {
		return goodsName + "  " + price +"   " + num ;
	}
	
}
