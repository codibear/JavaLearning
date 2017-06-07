package JavaStyle.interface1;

/**
 * Created by 29185 on 2017/6/5.
 */
public class HardDisk implements MobileStorage{
    @Override
    public void read() {
        System.out.println("HardDsik read.....");
    }

    @Override
    public void write() {
        System.out.println("HardDisk write.....");
    }
}
