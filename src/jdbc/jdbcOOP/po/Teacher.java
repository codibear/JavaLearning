package jdbc.jdbcOOP.po;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 29185 on 2017/6/14.
 */
public class Teacher {
    private int tId;
    private String teacherNum;
    private String teacherName;
    private List<Banji> banjis = new ArrayList<>();

    public List<Banji> getBanjis() {
        return banjis;
    }

    public void setBanjis(List<Banji> banjis) {
        this.banjis = banjis;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String getTeacherNum() {
        return teacherNum;
    }

    public void setTeacherNum(String teacherNum) {
        this.teacherNum = teacherNum;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tId=" + tId +
                ", teacherNum='" + teacherNum + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", banjis=" + banjis +
                '}';
    }
}
