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
	// ��дInit()�����ṩ�ӿ���̨���빺����Ϣ
	public void Init(Scanner input, OrderUtil order, List arrayList) {

		System.out.print("�������û�����");
		String reader = input.next();
		order.setUserName(reader);
		// arrayList.add(order);

		while (true) {
			OrderUtil order2 = new OrderUtil();
			Scanner input2 = new Scanner(System.in);
			System.out.println("������ѡ��Ĳ�Ʒ��");
			System.out.print("��Ʒ�ţ�");
			String reader2 = input.next();
			// order2.setGoodsNo(reader2);

			System.out.print("���ƣ�");
			String reader3 = input.next();
			order2.setGoodsName(reader3);

			System.out.print("����������");
			int reader4 = input.nextInt();
			order2.setNum(reader4);

			System.out.print("��Ʒ���ۣ�");
			double reader5 = input.nextDouble();
			order2.setPrice(reader5);

			System.out.print("�Ƿ�������򣿣�Y/N����");
			// �������ַ���Ϊ��д
			String reader6 = input.next().toUpperCase();
			if (reader6.equals("Y"))
				arrayList.add(order2);
			else if (reader6.equals("N")) {
				arrayList.add(order2);
				System.out.println("�����ѽ�������");
				break;
			} else {
				arrayList.add(order2);
				System.out.println("������󣬳����ѽ�������");
				break;
			}
		}

	}

	// ��дSave()����������󵽡�save.bin��
	public void Save(List arrayList) {
		// �����ļ�����file���ڴ洢������Ϣ
		File file = new File("D:\\saved.bin");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// ����������ļ�
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(arrayList);//��arrayListд��
			oos.flush();// ˢ��
			oos.close();// �ر� ObjectOutputStream
			fos.close();// �ر�FileOutputStream
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// ��дLoad()������ö��󣬼���ͻ����踶��
	public void Load(File file, List arrayList) {
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			System.out.println("��Ʒ��  ����  ����");
			Object ob=ois.readObject();
			List<OrderUtil> st=(ArrayList<OrderUtil>) ob;
			for(Object o:st){
//				OrderUtil or= (OrderUtil) st;
				System.out.print(((OrderPay) st).getGoodsName()+"  ");
				System.out.print(((OrderPay) st).getPrice()+"  ");
				System.out.println(((OrderPay) st).getNum());
			}
		//	System.out.println(ois.readObject());
			System.out.println();// �س�����
			// �����ܼ۲����
			double count = 0;
			for (int i = 0; i < arrayList.size(); i++) {
				OrderUtil ou = (OrderUtil) arrayList.get(i);
				int num = ou.getNum();
				double price = ou.getPrice();
				count += num * price;
			}
			System.out.println("�����ܼۣ�" + count);
			
			ois.close();// �ر� ObjectOutputStream
			fis.close();// �ر�FileOutputStream
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
