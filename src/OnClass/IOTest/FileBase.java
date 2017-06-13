package OnClass.IOTest;

import java.io.*;

/**
 * Created by 29185 on 2017/6/7.
 */
public class FileBase {
    public static void main(String[] args) {
        //FIleInputStream的读入
        File file = new File("E:/temp/base.txt");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            byte [] b = new byte[]{98,99,97};
            try {
                fos.write(b);
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("---------------------------");
        //FileOutputStream的写出
        try {
            FileInputStream fis = new FileInputStream(file);
            byte [] b = new byte[(int) file.length()];
            try {
                System.out.println((char)fis.read());
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.read(b);
            } catch (IOException e) {
                e.printStackTrace();
            }
           /* for (byte v:b){
                System.out.println((char)v);
                //System.out.println((char)fis.read());//直接输出的
            }*/

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("============================");
        //FileWriter输入
        File file1 = new File("E:/tmp2/Reader.txt");
        try {
            file1.createNewFile();
            FileWriter fw = new FileWriter(file1);
            fw.write("你好啊！");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//FileReader 输出
        try {
            FileReader fr = new FileReader(file1);
            try {
                while (fr.read()!=-1){
                    System.out.print((char)fr.read());
                }

                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
