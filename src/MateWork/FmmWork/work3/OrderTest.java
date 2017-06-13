package com.fmm.work3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderTest {

	public static void main(String[] args) {
		// �����ļ�����file���ڴ洢������Ϣ
		File file = new File("D:\\saved.bin");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		List<OrderUtil> arrayList = new ArrayList<>();
		OrderUtil op = new OrderUtil();
		Scanner input = new Scanner(System.in);

		// OrderUtil����op����Init����
		op.Init(input, op, arrayList);

		// ����Save����
		op.Save(arrayList);

		// ����Load����
		op.Load(file,arrayList);

	}

}
