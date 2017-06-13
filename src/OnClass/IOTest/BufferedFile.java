package OnClass.IOTest;

import java.io.*;

/**
 * Created by 29185 on 2017/6/7.
 */
public class BufferedFile {
    public static void main(String[] args) {
        File file = new File("E:/temp/text.txt");
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("今天好开心啊！！");
            bw.newLine();
            bw.write("有吃成长快乐了！");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("-------------------");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            try {
                System.out.println(br.readLine());              //一行一行的输出
                System.out.println(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
