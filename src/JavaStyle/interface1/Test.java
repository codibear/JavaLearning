package JavaStyle.interface1;

/**
 * Created by 29185 on 2017/6/5.
 */
public class Test {
    public static void main(String[] args) {
        FlashDisk flashDisk = new FlashDisk();
        HardDisk hardDisk = new HardDisk();
        Mp3 mp3 = new Mp3();

        Computer computer = new Computer();
        computer.setStorage(flashDisk);
        computer.readData();
        computer.writeData();

        computer.setStorage(hardDisk);
        computer.writeData();
        computer.readData();
    }
}
