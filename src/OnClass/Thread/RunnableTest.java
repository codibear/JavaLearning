package OnClass.Thread;

/**
 * Created by 29185 on 2017/6/8.
 */
public class RunnableTest {
    public static void main(String[] args) {
        //一个类实现Runnable，并且去创建实例
        RunnableImpl runnable1 = new RunnableImpl();
        RunnableImpl runnable2 = new RunnableImpl();

        //Runnable 作为参数传递到Thread中
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
    }
}
