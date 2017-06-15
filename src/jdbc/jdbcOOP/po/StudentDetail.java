package jdbc.jdbcOOP.po;

/**
 * Created by 29185 on 2017/6/14.
 */
public class StudentDetail {
    private int sdid;
    private char minzu;
    private String phone;
    private String idcard;

    public int getSdid() {
        return sdid;
    }

    public void setSdid(int sdid) {
        this.sdid = sdid;
    }

    public char getMinzu() {
        return minzu;
    }

    public void setMinzu(char minzu) {
        this.minzu = minzu;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }
}
