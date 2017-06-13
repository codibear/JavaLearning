package com.icss.test.homework10.test3;

/**
 * Created by 29185 on 2017/6/13.
 */
public class Pet {
    private int pid;
    private String mname;
    private String pname;
    private String ptype;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    @Override
    public String toString() {
        return "ptype="+ptype;
    }
}
