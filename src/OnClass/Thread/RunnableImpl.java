package OnClass.Thread;

/**
 * Created by 29185 on 2017/6/8.
 */
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        for (int i = 0 ;i <50;i++){
            System.out.println(Thread.currentThread().getName()+"\t"+i);
        }
    }
}
