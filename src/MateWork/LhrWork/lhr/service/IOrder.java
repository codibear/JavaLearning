package com.lhr.service;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import com.lhr.po.Product;

public interface IOrder {
	//��ȡ������Ϣ
	void Init(Scanner input,List arrayList);
	//���涩������
	void Save(List arrayList,File file);
	//��ȡ����
	void Load(List arrayList,File file);
}
