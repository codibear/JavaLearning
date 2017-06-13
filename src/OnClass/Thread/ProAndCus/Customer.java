package OnClass.Thread.ProAndCus;

/**
 * Created by 29185 on 2017/6/8.
 */
public class Customer extends Thread{
    int num;
    @Override
    public void run() {
        get(num);
    }
    public void get(int num) {
        synchronized (Customer.class){
        //仓库没有空间，可以取东西
        if (num <= Store.getNum() && Store.getNum() >= 0) {
            Store.deleteStroe("something");
            Store.deleteNum(num);
            this.notifyAll();
            System.out.println("仓库别去走了东西,现在有" + Store.getNum() + "产品");

        } else {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    }
}
