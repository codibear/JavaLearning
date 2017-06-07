package com.icss.test.homework7.test3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by 29185 on 2017/6/6.
 */
public class Test {
    public static void main(String[] args) {
        Penguin p1 = new Penguin("A","a");
        Penguin p2 = new Penguin("B","b");
        Penguin p3 = new Penguin("C","c");
        Penguin p4 = new Penguin("D","d");

        List linkedList = new LinkedList();
        linkedList.add(p1);
        linkedList.add(p2);
        linkedList.add(p3);
        linkedList.add(p4);
        System.out.println("一共有"+linkedList.size()+"只企鹅");

        Iterator it = linkedList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("删除后：");
        linkedList.remove(p1);
        linkedList.remove(2);
        Iterator it2 = linkedList.iterator();
        while (it2.hasNext()){
            Object o = it2.next();
            System.out.println(o);
        }
        Iterator it3 = linkedList.iterator();
        System.out.println("判断是否有C企鹅：");
        while (it3.hasNext()){
            if(((Penguin)(it3.next())).getName().equals("C")){
                System.out.println("有C企鹅。");
            }
        }

    }
}
