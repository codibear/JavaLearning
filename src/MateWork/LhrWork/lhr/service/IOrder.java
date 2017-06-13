package com.lhr.service;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import com.lhr.po.Product;

public interface IOrder {
	//获取输入信息
	void Init(Scanner input,List arrayList);
	//保存订单对象
	void Save(List arrayList,File file);
	//获取对象
	void Load(List arrayList,File file);
}
