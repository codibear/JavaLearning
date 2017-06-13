package com.fmm.work3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderUtil extends OrderPay {
	// 编写Init()方法提供从控制台输入购买信息
	public void Init(Scanner input, OrderUtil order, List arrayList) {

		System.out.print("请输入用户名：");
		String reader = input.next();
		order.setUserName(reader);
		// arrayList.add(order);

		while (true) {
			OrderUtil order2 = new OrderUtil();
			Scanner input2 = new Scanner(System.in);
			System.out.println("请输入选择的产品：");
			System.out.print("产品号：");
			String reader2 = input.next();
			// order2.setGoodsNo(reader2);

			System.out.print("名称：");
			String reader3 = input.next();
			order2.setGoodsName(reader3);

			System.out.print("购买数量：");
			int reader4 = input.nextInt();
			order2.setNum(reader4);

			System.out.print("产品单价：");
			double reader5 = input.nextDouble();
			order2.setPrice(reader5);

			System.out.print("是否继续购买？（Y/N）：");
			// 将输入字符设为大写
			String reader6 = input.next().toUpperCase();
			if (reader6.equals("Y"))
				arrayList.add(order2);
			else if (reader6.equals("N")) {
				arrayList.add(order2);
				System.out.println("程序已结束！！");
				break;
			} else {
				arrayList.add(order2);
				System.out.println("输入错误，程序已结束！！");
				break;
			}
		}

	}

	// 编写Save()方法保存对象到“save.bin”
	public void Save(List arrayList) {
		// 创建文件对象file用于存储订单信息
		File file = new File("D:\\saved.bin");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 将对象存入文件
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(arrayList);//将arrayList写入
			oos.flush();// 刷新
			oos.close();// 关闭 ObjectOutputStream
			fos.close();// 关闭FileOutputStream
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 编写Load()方法获得对象，计算客户所需付款
	public void Load(File file, List arrayList) {
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			System.out.println("产品名  单价  数量");
			Object ob=ois.readObject();
			List<OrderUtil> st=(ArrayList<OrderUtil>) ob;
			for(Object o:st){
//				OrderUtil or= (OrderUtil) st;
				System.out.print(((OrderPay) st).getGoodsName()+"  ");
				System.out.print(((OrderPay) st).getPrice()+"  ");
				System.out.println(((OrderPay) st).getNum());
			}
		//	System.out.println(ois.readObject());
			System.out.println();// 回车换行
			// 计算总价并输出
			double count = 0;
			for (int i = 0; i < arrayList.size(); i++) {
				OrderUtil ou = (OrderUtil) arrayList.get(i);
				int num = ou.getNum();
				double price = ou.getPrice();
				count += num * price;
			}
			System.out.println("订单总价：" + count);
			
			ois.close();// 关闭 ObjectOutputStream
			fis.close();// 关闭FileOutputStream
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
