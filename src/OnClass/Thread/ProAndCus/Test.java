package OnClass.Thread.ProAndCus;

/**
 * Created by 29185 on 2017/6/8.
 *
 * 为什么会有问题：
 * 1.线程只能自己等，不能让别人等，等完以后才能去执行，执行完唤醒
 * 2.
 *
 */
public class Test {
    public static void main(String[] args) {
        Store store = new Store();
        Producter p1 = new Producter();
        Producter p2 = new Producter();
        Producter p3 = new Producter();
        Producter p4 = new Producter();
        Customer c1 = new Customer();
        Customer c2 = new Customer();
        Customer c3 = new Customer();
        p1.set(20);
        p2.set(10);
        p3.set(30);
        p4.set(20);
        c1.get(10);
        c2.get(20);
        c3.get(30);

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        c1.start();
        c2.start();
        c3.start();



    }
}
