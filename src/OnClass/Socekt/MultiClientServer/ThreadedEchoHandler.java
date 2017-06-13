package OnClass.Socekt.MultiClientServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/12.
 */
public class ThreadedEchoHandler implements Runnable{
    private Socket incoming;
    public ThreadedEchoHandler(Socket i){
        incoming = i;
    }
    public void run(){

        try {
            OutputStream outputStream = incoming.getOutputStream();
            InputStream inputStream = incoming.getInputStream();
            Scanner in = new Scanner(inputStream);
            PrintWriter out = new PrintWriter(outputStream,true);
            out.println("Hello!Enter BYE to Exit.");
            boolean done = false;
            while (!done&&in.hasNextLine()){
                String line = in.nextLine();
                out.println("Echo: "+line);
                if(line.trim().equals("BYE"))
                    done=true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                incoming.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
