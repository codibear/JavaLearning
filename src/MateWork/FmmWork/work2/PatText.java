package com.fmm.work2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 * @author vera
 *��������Ϣ���л����������ļ��������л�
 */
public class PatText {
	public static void main(String[] args) {
		// ����Pat���󣬲���ֵ
		Pat p = new Pat();
		p.setName("СH");
		p.setKinds("����");
		p.setHost("���ܻ�");

		// �����ļ�,���ڴ洢Pat������Ϣ
		File file = new File("e:\\save.bin");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// ʹ��ObjectOutputStream���������л����ļ���
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(p);
			oos.flush();// ˢ������
			oos.close();// �ر�ObjectOutputStream
			fos.close();// �ر�FileOutputStream
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// ͨ��ObjectInputStream�����л��������С�
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Pat pat = (Pat) ois.readObject();
			System.out.println(pat);
			ois.close();// �ر�ObjectIntputStream
			fis.close();// �ر�FileInputStream
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
