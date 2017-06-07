package OnClass;

/**
 * Created by 29185 on 2017/5/24.
 * 面向对象，访问权限体验
 *
 */
public class Account {
    private int id;
    private String password;
    private double balance;

    Account(int id, String password,double balance){
        this.id = id;
        this.balance = balance;
        this.password = password;
    }
    Account(){}

    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password,int idcar) {
        if(idcar==123){
        this.password = password;
        System.out.println("xiugaichegngong");
        }else {
            System.out.println("xiugaishibai");
        }
    }

    public static void main(String [] args){
        Account account = new Account(1111,"6666",900);
        account.setPassword("213",111);
    }
}
