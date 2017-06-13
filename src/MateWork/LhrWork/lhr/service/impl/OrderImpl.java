package com.lhr.service.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;

import com.lhr.po.Product;
import com.lhr.service.IOrder;

public class OrderImpl implements IOrder{

	@Override
	//获取用户输入的订单信息
	public void Init(Scanner input,List arrayList) {
		System.out.print("请输入用户名：");
		String userName=input.next();
		boolean flag=true;
		do{
			Product pro=new Product();
			System.out.println("请输入选择的产品：");
			
			System.out.print("产品号：");
			int proId=input.nextInt();
			pro.setProId(proId);
			
			System.out.print("名称：");
			String proName=input.next();
			pro.setProName(proName);
			
			System.out.print("购买数量：");
			int proNum=input.nextInt();
			pro.setProNum(proNum);
			
			System.out.print("产品单价：");
			double proPrice=input.nextDouble(); 
			pro.setProPrice(proPrice);
			//将添加的产品对象添加到数组集合中
			arrayList.add(pro);
			
			System.out.print("是否继续？Y/N：");
			String result=input.next();
			//判断遇到N退出循环
			if(result.equalsIgnoreCase("N")){
				flag=false;
			}
		}while(flag);
		
	}

	@Override
	//保存订单信息
	public void Save(List arrayList,File file) {
		try {
			file.createNewFile();
			//序列化输出，将数组集合写入文件中
			FileOutputStream fos=new FileOutputStream(file);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			for(int i=0;i<arrayList.size();i++){
				oos.writeObject(arrayList);
			}
			//关闭流文件
			oos.close();
			fos.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	//读取订单信息
	public void Load(List arrayList,File file) {
		//反序列化输入
		try {
			FileInputStream fis=new FileInputStream(file);
			ObjectInputStream ois=new ObjectInputStream(fis);
			List arr=(List)ois.readObject();
			System.out.println("产品编号          "+"产品名          "+"产品数量          "+"产品单价");
			//输出信息并计算总价格
			double sum=0;
			for(int i=0;i<arr.size();i++){
				Product pro=(Product) arr.get(i);
				double s=pro.getProNum()*pro.getProPrice();
				System.out.println(arr.get(i));
				sum+=s;
			}
			System.out.println("订单总价为："+sum+"元");
			//关闭流文件
			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
