import Test.Person;

/**
 * Created by 29185 on 2017/5/19.
 */
class PersonalAccount {
    String accountId;
    String pwd;
    double balance;
    PersonalAccount(){}
    PersonalAccount(String accountId,String pwd){
        this.accountId = accountId;
        this.pwd = pwd;
    }
    PersonalAccount(String accountId,String pwd,double balance){
        this.accountId = accountId;
        this.pwd = pwd;
        this.balance = balance;
    }
    //静态块、实例块
    static {
        System.out.println("金太快，加载.....");
    }
    {
        System.out.println("实例块，创建实例，加载.....");
    }
    //内部类，直言是语法
    class Helper{
        int x;
        void help(){
            balance++;
        }
    }

    /**
     * 方法与构造方法的相关内容
     * @return
     */
    //查看id
    String  getAccountId(){
        return accountId;
    }
    //修改密码
    void setPwd(String pwd){
        this.pwd = pwd;
    }
    //查看余额
    double getBalance(){
        return balance;
    }
    //存款,活期
    void deposit(double amount){
        balance += amount;
    }
    //存款，定期
    void deposit(double amount,int term){
        balance+=amount;
        System.out.print("存期："+ term);
    }
    //取款，不能透支
    boolean withdraw(double amount){
        if(amount > balance){
            return false;
        }else {
            balance -= amount;
            return true;
        }
    }

    public static void main(String [] args){
        PersonalAccount account = new PersonalAccount();
        System.out.println("account1账户id"+account.getAccountId());
        System.out.println("account1账户余额"+account.getBalance());
        account.deposit(1000);
        System.out.println("account1账户余额"+account.getBalance());
        account.withdraw(200);
        System.out.println("account1账户余额"+account.getBalance());
        //块的验证
        PersonalAccount account2 = new PersonalAccount();
}
}