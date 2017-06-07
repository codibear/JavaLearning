package com.icss.test.homework3_change;

/**
 * Created by 29185 on 2017/5/25.
 */
public class JIeMu {
    private String name;
    private String id;
    private int ticket;
    JIeMu(){}
    JIeMu(String name, String id){
        this.name = name;
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public int getTicket() {
        return ticket;
    }

    public String getId() {
        return id;
    }
    //对票数进行+1
    public void addTicket(){
        this.ticket++;
    }
    //判断输入是否合法
    public boolean isSameCode(String code){
        return this.id.equalsIgnoreCase(code);
    }
    //  shuchu
    public void showMsg(int index){
        switch (index){
            case 1:
                System.out.println(this.id+":"+this.name);
                break;
            case 2:
                System.out.println(this.name+":"+this.ticket);
                break;
            case 3:
                System.out.println("观众最喜欢的节目是："+this.name+"获得"+this.ticket+"票");
                break;
            default:
                break;
        }
    }
}
