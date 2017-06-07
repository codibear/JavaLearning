package JavaStyle.interface1;

/**
 * Created by 29185 on 2017/6/5.
 */
public class Mp3 implements MobileStorage,Player{
    @Override
    public void play() {
        System.out.println("playing....");
    }

    @Override
    public void stop() {
        System.out.println("stop.....");
    }

    @Override
    public void read() {
        System.out.println("Mp3 reading ......");
    }

    @Override
    public void write() {
        System.out.println("Mp3 writing ......");
    }
}
