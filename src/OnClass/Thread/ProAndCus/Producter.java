package OnClass.Thread.ProAndCus;

/**
 * Created by 29185 on 2017/6/8.
 */
public class Producter extends Thread{
    int num;
    @Override
    public void run() {
        set(num);
    }
    public   void set(int num) {
        synchronized (Producter.class){
        //仓库还有空间可以添加
        if (Store.getNum() + num <= Store.getSize()) {
            Store.setStore("somthing");
            Store.addNum(num);
            this.notifyAll();
            System.out.println("进行了生产，一共有" + Store.getNum() + "还可以添加" + (Store.getSize() - Store.getNum()));
        } else {
            //仓库没有空间了
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    }
}
