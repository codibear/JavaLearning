package com.icss.test.homework7.test1.test;

import com.icss.test.homework7.test1.service.ArrayListServiceIpml;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/6.
 */
public class test {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        ArrayListServiceIpml arrayListTest = new ArrayListServiceIpml();
        arrayListTest.add((ArrayList) arrayList,scanner);
        arrayListTest.output((ArrayList) arrayList);
    }
}
