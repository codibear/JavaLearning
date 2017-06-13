package com.fmm.work1;

import java.io.FileWriter;
import java.io.IOException;

public class PatView {
	public static void main(String[] args) {
		String str = "您好！我的名字是小H，我是一只小土狗。我的主人是刘宪华。";
		// 1、创建字符输出流对象，负责向e:\\pet.txt写入数据
		try {
			FileWriter fw = new FileWriter("e:\\pet.txt");
			// 2、把str的内容的写入到fw所指文件中
			fw.write(str);
			// 3、一定要关闭输出流
			if (null != fw)
				fw.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
}
}
