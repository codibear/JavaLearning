package JavaStyle.interface1;

/**
 * Created by 29185 on 2017/6/5.
 */
public class FlashDisk implements MobileStorage{
    @Override
    public void read() {
        System.out.println("Upan read.....");
    }

    @Override
    public void write() {
        System.out.println("Upan write.....");
    }
}
