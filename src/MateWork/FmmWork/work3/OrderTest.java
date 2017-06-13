package com.fmm.work3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderTest {

	public static void main(String[] args) {
		// 创建文件对象file用于存储订单信息
		File file = new File("D:\\saved.bin");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		List<OrderUtil> arrayList = new ArrayList<>();
		OrderUtil op = new OrderUtil();
		Scanner input = new Scanner(System.in);

		// OrderUtil对象op调用Init方法
		op.Init(input, op, arrayList);

		// 调用Save方法
		op.Save(arrayList);

		// 调用Load方法
		op.Load(file,arrayList);

	}

}
