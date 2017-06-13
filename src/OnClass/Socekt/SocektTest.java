package OnClass.Socekt;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by 29185 on 2017/6/12.
 */
public class SocektTest {
    public static void main(String[] args) {
        Socket s = new Socket();
        //s.connect(new SocketAddress("www.baidu.com",8080));
        try {
            InetAddress address = InetAddress.getByName("www.baidu.com");
            InetAddress [] addresss = InetAddress.getAllByName("www.baidu.com");
            System.out.println(address.toString());
            address=InetAddress.getLocalHost();
            System.out.println(address);
            for (InetAddress a:addresss) {
                System.out.println(a);
            }
            //address=InetAddress.getAllByName("www.baidu.com","www.sina.com");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
