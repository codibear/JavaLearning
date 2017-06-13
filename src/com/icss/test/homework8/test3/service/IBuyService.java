package com.icss.test.homework8.test3.service;

import com.icss.test.homework8.test3.util.MyArrayList;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/7.
 */
public interface IBuyService {
    HashMap init(Scanner scanner) throws Exception;
    File save(MyArrayList arrayList, File file);
    void load(File file);
}
