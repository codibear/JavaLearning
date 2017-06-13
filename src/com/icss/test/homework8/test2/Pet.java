package com.icss.test.homework8.test2;

import java.io.Serializable;

/**
 * Created by 29185 on 2017/6/7.
 */
public class Pet  implements Serializable {
    private String name;
    private String type;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "名字："+name+"种类："+type;
    }
}
