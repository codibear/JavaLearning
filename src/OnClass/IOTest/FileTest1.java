package OnClass.IOTest;

import java.io.File;
import java.io.IOException;

/**
 * Created by 29185 on 2017/6/7.
 */
public class FileTest1 {
    public static void main(String[] args) {
        //相见文件，必须写得先创建文件夹！然后再创建文件
        File filetest = new File("/tmp2");
        filetest.mkdir();

        try {
            filetest.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File file = new File("E:/temp");
        file.mkdir();
        File file1 = new File("E:/temp/text.txt");
        try {

            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(file.exists()){
            System.out.println(file.getName());
        }else {
            System.out.println("不存在！");
        }
        System.out.println(file1.canWrite());
        try {
            System.out.println(file1.getCanonicalFile());//获得文件路径，和获得文件夹路径差不多
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("剩余空间："+file1.getFreeSpace()/1024/1024/1024);
        System.out.println("返回上一级文件夹："+file1.getParent());
        System.out.println("返回上一级文件夹："+file1.getParentFile());
        System.out.println("总空间：file1.getTotalSpace():"+file1.getTotalSpace()/1024/1024/1024);

    }
}
