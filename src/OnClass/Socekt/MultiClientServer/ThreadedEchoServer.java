package OnClass.Socekt.MultiClientServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by 29185 on 2017/6/12.
 */
public class ThreadedEchoServer {
    public static void main(String[] args) {
        int i =1;
        try {
            ServerSocket ss = new ServerSocket(9999);
            while(true){
                Socket incoming = ss.accept();
                System.out.println("Spawning "+i);
                Runnable r = new ThreadedEchoHandler(incoming);
                Thread t = new Thread(r);
                t.start();
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
