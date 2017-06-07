package com.icss.test.homework6.setage;

/**
 * Created by 29185 on 2017/6/5.
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        try {
            student.setAge(200);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
