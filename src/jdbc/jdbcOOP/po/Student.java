package jdbc.jdbcOOP.po;

/**
 * Created by 29185 on 2017/6/14.
 */
public class Student {
    private int sId;
    private String studentNum;
    private String studentName;
    private char sex;
    private StudentDetail studentDetail;
    private Banji banji;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }



    public Banji getBanji() {
        return banji;
    }

    public void setBanji(Banji banji) {
        this.banji = banji;
    }

    public StudentDetail getStudentDetail() {
        return studentDetail;
    }

    public void setStudentDetail(StudentDetail studentDetail) {
        this.studentDetail = studentDetail;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
