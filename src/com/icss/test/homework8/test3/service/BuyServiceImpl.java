package com.icss.test.homework8.test3.service;

import com.icss.test.homework8.test3.po.Goods;
import com.icss.test.homework8.test3.util.MyArrayList;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/7.
 */
public class BuyServiceImpl implements IBuyService{

    static double sum = 0;

    //用于从控制台输入信息
    @Override
    public HashMap init(Scanner scanner){
        boolean flag = true;
        //接受数据
        Goods goods = new Goods();
        System.out.println("请输入选择的产品：\n产品号：");
        int id = scanner.nextInt();
        System.out.println("名称：");
        String goodsName = scanner.next();
        System.out.println("购买数量：");
        int num = scanner.nextInt();
        System.out.println("单价：");
        double price = scanner.nextDouble();
        System.out.println("是否继续？\tY/N");
        String check = scanner.next();
        goods.setName(goodsName);
        goods.setNum(num);
        goods.setId(id);
        goods.setPrice(price);
        //判断是否继续输入
        if(check.equalsIgnoreCase("N")){
            flag=false;
        }
        //封装到hashMap中
        Map hashMap = new HashMap();
        hashMap.put("goods",goods);
        hashMap.put("flag",flag);
        return (HashMap) hashMap;
    }
    //用于保存对象到save.bin中
    @Override
    public File save(MyArrayList arrayList, File file) {
        try {
            FileOutputStream fw = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fw);
            oos.writeObject(arrayList);
            oos.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }
    //用于读取数据，并计算
    @Override
    public void load(File file) {
        try {
            FileInputStream fw = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fw);
            try {
                System.out.println("产品名\t单价\t数量");
                Object o = ois.readObject();
                MyArrayList myArrayList = ((MyArrayList)o);
                for (Object a:myArrayList){
                    Goods goods = ((Goods)a);
                    System.out.print(goods.getName());
                    System.out.print("\t"+goods.getPrice()+"\t");
                    System.out.print("\t"+goods.getNum()+"\n");
                    sum += (goods.getNum() * goods.getPrice());
                }
                System.out.println("订单总价："+sum);
                ois.close();
                fw.close();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
