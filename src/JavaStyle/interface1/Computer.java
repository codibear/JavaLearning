package JavaStyle.interface1;

/**
 * Created by 29185 on 2017/6/5.
 *
 */
public class Computer {

    //面向接口,动态决定用什么类型参数
    private MobileStorage storage;
    public void setStorage(MobileStorage storage){
        this.storage = storage;
    }
    public void readData(){
        storage.read();
    }
    public void writeData(){
        storage.write();
    }
//--------------------------------------------------------
    //电脑可能用到的移动设备
    private FlashDisk flashDisk;
    private HardDisk hardDisk;
    private Mp3 mp3;

    //闪盘读数据，那么不同的设备就要有许多不同的方法
    public void readData(FlashDisk d){
        d.read();
    }
}
