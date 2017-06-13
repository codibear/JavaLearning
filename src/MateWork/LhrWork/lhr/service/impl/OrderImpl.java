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
	//��ȡ�û�����Ķ�����Ϣ
	public void Init(Scanner input,List arrayList) {
		System.out.print("�������û�����");
		String userName=input.next();
		boolean flag=true;
		do{
			Product pro=new Product();
			System.out.println("������ѡ��Ĳ�Ʒ��");
			
			System.out.print("��Ʒ�ţ�");
			int proId=input.nextInt();
			pro.setProId(proId);
			
			System.out.print("���ƣ�");
			String proName=input.next();
			pro.setProName(proName);
			
			System.out.print("����������");
			int proNum=input.nextInt();
			pro.setProNum(proNum);
			
			System.out.print("��Ʒ���ۣ�");
			double proPrice=input.nextDouble(); 
			pro.setProPrice(proPrice);
			//����ӵĲ�Ʒ������ӵ����鼯����
			arrayList.add(pro);
			
			System.out.print("�Ƿ������Y/N��");
			String result=input.next();
			//�ж�����N�˳�ѭ��
			if(result.equalsIgnoreCase("N")){
				flag=false;
			}
		}while(flag);
		
	}

	@Override
	//���涩����Ϣ
	public void Save(List arrayList,File file) {
		try {
			file.createNewFile();
			//���л�����������鼯��д���ļ���
			FileOutputStream fos=new FileOutputStream(file);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			for(int i=0;i<arrayList.size();i++){
				oos.writeObject(arrayList);
			}
			//�ر����ļ�
			oos.close();
			fos.close();
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	//��ȡ������Ϣ
	public void Load(List arrayList,File file) {
		//�����л�����
		try {
			FileInputStream fis=new FileInputStream(file);
			ObjectInputStream ois=new ObjectInputStream(fis);
			List arr=(List)ois.readObject();
			System.out.println("��Ʒ���          "+"��Ʒ��          "+"��Ʒ����          "+"��Ʒ����");
			//�����Ϣ�������ܼ۸�
			double sum=0;
			for(int i=0;i<arr.size();i++){
				Product pro=(Product) arr.get(i);
				double s=pro.getProNum()*pro.getProPrice();
				System.out.println(arr.get(i));
				sum+=s;
			}
			System.out.println("�����ܼ�Ϊ��"+sum+"Ԫ");
			//�ر����ļ�
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
