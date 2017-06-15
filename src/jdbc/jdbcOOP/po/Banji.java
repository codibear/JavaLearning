package jdbc.jdbcOOP.po;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 29185 on 2017/6/14.
 */
public class Banji {
    private int bId;
    private String bName;
    private List<Teacher> teachers = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }
}
