package Thread;

/**
 * Created by 29185 on 2017/5/7.
 */
class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for(int i = 0;i<60;i++){
            System.out.print(getName()+"run...."+i);
        }
    }
}
public class ThreadDemo {
    public static void main(String [] args){
        MyThread a = new MyThread("dadsaf");
        a.start();
       //裁判打两枪，运动员懵逼 a.start();
        for (int i = 0;i<60;i++){
            System.out.print(Thread.currentThread().getName()+"Main..."+i);
        }
    }
}
