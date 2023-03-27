package UdpClientServer;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddr {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip = InetAddress.getByName("www.google.com");
        System.out.println("Host Name: "+ip.getHostName());
        System.out.println("IP Address: "+ip.getHostAddress());
    }
}
