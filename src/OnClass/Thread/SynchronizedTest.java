package OnClass.Thread;

/**
 * Created by 29185 on 2017/6/8.
 */
public class SynchronizedTest extends Thread implements Runnable{
    private static int num = 100;

    public void setNum(int num) {
        this.num = num;
    }
    //用synchronized修饰方法
    public  static synchronized void delete(){
        num-=20;
        System.out.println(num);
    }
    //用synchronized修饰代码块
    public void add(){
        synchronized (SynchronizedTest.class){
            num += 20;
            System.out.println(num);
        }
    }
    public int getNum() {
        return num;
    }

    @Override
    public void run() {
        //delete();
        add();
    }

    public static void main(String[] args) {
        //当同一类的两个对象操作同一个方法是，就会出现问题
        //此时我们需要做的是，把不同对象调用的相同方法，用 static synchronized 修饰，或者用 synchronized修饰代码块
        //但是修饰代码块的时候 synchronized (类名.class){}这样才能保证，不同对象调用的是后，开的是一把锁
        SynchronizedTest synchronizedTest = new SynchronizedTest();
        SynchronizedTest synchronizedTest1 = new SynchronizedTest();
        synchronizedTest.start();
        synchronizedTest1.start();
    }
}
