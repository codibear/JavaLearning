package OnClass.Thread;

/**
 * Created by 29185 on 2017/6/8.
 */
public class MyThreadTest {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("A");
        MyThread thread2 = new MyThread("B");
        thread2.start();
        thread1.start();
        for (int i =0 ;i<20;i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
