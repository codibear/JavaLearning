package com.lhr.view;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lhr.service.impl.OrderImpl;

/**
 * @author lhr
 * @time 2017年6月7日 下午6:27:44
 * @version
 * 
 */
public class TestOrder {
	public static void main(String[] args) {
		//创建各种对象
		Scanner input=new Scanner(System.in);
		List arrayList=new ArrayList();
		OrderImpl order=new OrderImpl();
		File file=new File("D:\\save.bin");
		
		if(file.exists()){
			//计算订单价格
			order.Load(arrayList, file);
		}else{
			//新订单录入
			order.Init(input, arrayList);
			//保存订单
			order.Save(arrayList, file);
			//计算订单价格
			order.Load(arrayList, file);
		}
	}
}
