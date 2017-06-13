package Quiz3.test3.view;

import Quiz3.test3.po.CustomList;
import Quiz3.test3.po.Goods;
import Quiz3.test3.serviceimpl.BuyServiceImpl;

import java.util.ArrayList;

/**
 * Created by 29185 on 2017/6/9.
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Goods> arrayList = new ArrayList<>();
        Goods shuPian = new Goods(1,"薯片",50,1.5);
        Goods laTiao = new Goods(2,"拉条",50,1);
        Goods qiaoKeLi = new Goods(3,"德芙",50,5);
        arrayList.add(shuPian);
        arrayList.add(laTiao);
        arrayList.add(qiaoKeLi);
        BuyServiceImpl buy = new BuyServiceImpl();
        ArrayList<CustomList> customLists = buy.buy(arrayList);
        buy.output(customLists);
    }
}
