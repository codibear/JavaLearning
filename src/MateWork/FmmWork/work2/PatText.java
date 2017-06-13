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
 *将宠物信息序列化到二进制文件并反序列化
 */
public class PatText {
	public static void main(String[] args) {
		// 创建Pat对象，并赋值
		Pat p = new Pat();
		p.setName("小H");
		p.setKinds("狗狗");
		p.setHost("刘宪华");

		// 创建文件,用于存储Pat对象信息
		File file = new File("e:\\save.bin");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 使用ObjectOutputStream将内容序列化到文件。
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(p);
			oos.flush();// 刷新数据
			oos.close();// 关闭ObjectOutputStream
			fos.close();// 关闭FileOutputStream
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 通过ObjectInputStream反序列化到程序中。
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Pat pat = (Pat) ois.readObject();
			System.out.println(pat);
			ois.close();// 关闭ObjectIntputStream
			fis.close();// 关闭FileInputStream
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
