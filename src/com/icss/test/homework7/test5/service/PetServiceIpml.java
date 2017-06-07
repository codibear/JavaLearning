package com.icss.test.homework7.test5.service;

import com.icss.test.homework7.test5.po.Pet;

import java.util.ArrayList;

/**
 * Created by 29185 on 2017/6/6.
 */
public class PetServiceIpml implements IPetService {
    @Override
    public void check(ArrayList arrayList, Pet pet) {
        boolean flag = false;
        for (Object o:arrayList) {
            if (((Pet)o).getName().equals(pet.getName())) {
                System.out.println(o);
                flag = true;
            }
        }


        if (flag == false) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("没有您输入的宠物名称！");
            }
        }
    }
}


