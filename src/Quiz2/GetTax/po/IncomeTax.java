package Quiz2.GetTax.po;

/**
 * Created by 29185 on 2017/6/2.
 * 实体类信息输入类
 */
public class IncomeTax {
    //应缴税额
    double sholdeTax;
    //税后收入
    double after ;
    //所交税
    double getTax;
    //税前收入
    private double before;

    public double getBefore() {
        return before;
    }

    public void setBefore(double before) {
        this.before = before;
    }

    public double getAfter() {
        return after;
    }

    public double getGetTax() {
        return getTax;
    }

    public double getSholdeTax() {
        return sholdeTax;
    }

    public void setAfter(double after) {
        this.after = after;
    }

    public void setGetTax(double getTax) {
        this.getTax = getTax;
    }

    public void setSholdeTax(double sholdeTax) {
        this.sholdeTax = sholdeTax;
    }
}
