package com.icss.test.homework2;

/**
 * Created by 29185 on 2017/5/23.
 */
public class MyTime {
    private int hour;
    private int minute;
    private int second;
    MyTime(){}
    MyTime(int hour,int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void addHour(int hour){
        this.hour += hour;
    }
    public void addMinute(int minute){
        this.minute += minute;
    }
    public void addSecond(int second){
        this.second += second;
    }
    public void subHour(int hour){
        this.hour -= hour;
    }
    public void subMinute(int minute){
        this.minute -= minute;
    }
    public void subSecond(int second){
        this.second -=second;
    }
}
