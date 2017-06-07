package Thread;

/**
 * Created by 29185 on 2017/5/7.
 */
class ThreadConcept1 extends Thread{
    @Override
    public void run() {
        for(int i = 1;i<60;i++)
        {
         System.out.print("run...."+i);
        }
    }
}
public class ThreadConcept{
    public static void main(String [] args){
        ThreadConcept1 a = new ThreadConcept1();
        a.start();
        for(int i = 1;i<60;i++)
        {
            System.out.print("main...."+i);
        }
    }
}

