package com.fmm.work1;

import java.io.FileWriter;
import java.io.IOException;

public class PatView {
	public static void main(String[] args) {
		String str = "���ã��ҵ�������СH������һֻС�������ҵ����������ܻ���";
		// 1�������ַ���������󣬸�����e:\\pet.txtд������
		try {
			FileWriter fw = new FileWriter("e:\\pet.txt");
			// 2����str�����ݵ�д�뵽fw��ָ�ļ���
			fw.write(str);
			// 3��һ��Ҫ�ر������
			if (null != fw)
				fw.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
}
}
