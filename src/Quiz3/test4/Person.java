package Quiz3.test4;

import java.io.Serializable;

/**
 * Created by 29185 on 2017/6/9.
 */
public class Person implements Serializable{
    private String name;
    private String pwd;
    private String birthday;
    private long tele;

    public Person() {
    }

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

    public String  getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public long getTele() {
        return tele;
    }

    public void setTele(long tele) {
        this.tele = tele;
    }

    public Person(String name, String pwd, String birthday, long tele) {
        this.name = name;
        this.pwd = pwd;
        this.birthday = birthday;
        this.tele = tele;
    }
}
