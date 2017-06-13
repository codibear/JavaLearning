package com.icss.test.homework8.test1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by 29185 on 2017/6/7.
 */
public class Pet {
    public static void main(String[] args) {
        File file = new File("E:/temp");
        File file1 = new File("E:/temp/pet.txt");
        String str = "您好！我的名字是欧欧，我是一只狗狗。我的主人是李伟。";
        try {
            file.mkdirs();
            file1.createNewFile();
            FileWriter fw = new FileWriter(file1);
            fw.write(str);
            if(null!=fw){
                fw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
