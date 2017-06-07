package Thread;

/**
 * Created by 29185 on 2017/5/7.
 * 另一种Thread的实现方法
 */
class MyThreadRunable  implements Runnable  {
    @Override
    public void run(){
        int count = 100;
        while (true){
            if(count > 0){
                System.out.print(Thread.currentThread().getName()+"d第"+(count--)+"zhang piao"+" ");
            }
        }
    }
}
public class ThreadRunable  {
public static void main(String [] args){
    MyThreadRunable runable = new MyThreadRunable();
    Thread thread1 = new Thread(runable);
    Thread thread2 = new Thread(runable);
    thread1.start();
    thread2.start();

}

}
