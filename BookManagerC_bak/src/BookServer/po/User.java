package BookServer.po;

import java.io.Serializable;

/**
 * Created by 29185 on 2017/6/12.
 */
public class User implements Serializable{
    private String name;
    private String pwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
