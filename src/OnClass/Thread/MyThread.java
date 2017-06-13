package OnClass.Thread;

/**
 * Created by 29185 on 2017/6/8.
 */
public class MyThread extends Thread {
    MyThread(String name){
        super(name);
    }
    MyThread(){}
    public void add(){
        for (int i = 0;i<50;i++){
            System.out.println(this.getName()+i);
        }
    }
    @Override
    public void run() {
        add();
    }
}
