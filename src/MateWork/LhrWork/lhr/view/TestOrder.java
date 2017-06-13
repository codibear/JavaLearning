package com.lhr.view;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.lhr.service.impl.OrderImpl;

/**
 * @author lhr
 * @time 2017��6��7�� ����6:27:44
 * @version
 * 
 */
public class TestOrder {
	public static void main(String[] args) {
		//�������ֶ���
		Scanner input=new Scanner(System.in);
		List arrayList=new ArrayList();
		OrderImpl order=new OrderImpl();
		File file=new File("D:\\save.bin");
		
		if(file.exists()){
			//���㶩���۸�
			order.Load(arrayList, file);
		}else{
			//�¶���¼��
			order.Init(input, arrayList);
			//���涩��
			order.Save(arrayList, file);
			//���㶩���۸�
			order.Load(arrayList, file);
		}
	}
}
