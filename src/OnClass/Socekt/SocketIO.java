package OnClass.Socekt;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by 29185 on 2017/6/12.
 */
public class SocketIO {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(9999);
            Socket s = new Socket();
            InputStream inStream = s.getInputStream();
            OutputStream outStream = s.getOutputStream();
            Scanner in = new Scanner(inStream);
            PrintWriter out = new PrintWriter(outStream,true);
            out.println("Hello!Enter BYE to exit.");
            boolean done = false;
            while (!done&&in.hasNextLine()){
                String line = in.nextLine();
                out.println("Echo : "+line);
                if(line.trim().equals("BYE"))
                    done=true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
