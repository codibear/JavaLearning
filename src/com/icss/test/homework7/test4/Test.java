package com.icss.test.homework7.test4;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 29185 on 2017/6/6.
 */
public class Test {
    public static void main(String[] args) {
        Map map = new HashMap();
        Country c1 = new Country("美利坚合众国","US");
        Country c2 = new Country("俄罗斯联邦","RU");
        Country c3 = new Country("中华人民共和国","CN");
        Country c4 = new Country("法兰西合众国","FR");
        map.put(c1.getId(),c1.getName());
        map.put(c2.getId(),c2.getName());
        map.put(c3.getId(),c3.getName());
        map.put(c4.getId(),c4.getName());
        System.out.println("CN对应的国家是："+map.get("CN"));
        System.out.println("Map中共有"+map.size()+"组数据");
        System.out.println("Map中包含FR的key吗？"+map.containsKey("FR"));
        map.remove("FR");
        System.out.println("Map中包含FR的key吗？"+map.containsKey("FR"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map);
    }
}
