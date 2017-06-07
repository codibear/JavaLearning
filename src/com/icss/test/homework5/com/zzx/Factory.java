package com.icss.test.homework5.com.zzx;

import com.icss.test.homework5.com.zzx.po.Base;
import com.icss.test.homework5.com.zzx.po.Student;

/**
 * Created by 29185 on 2017/6/1.
 */
public class Factory {
    public static Base getInstance (Base base){
        if(base instanceof Student){
            return new Student();
        }else {
            return null;
        }
    }
}
