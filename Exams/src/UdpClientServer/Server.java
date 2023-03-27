package UdpClientServer;

import java.io.IOException;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        byte[] buf = new byte[256];
        String msg = "Hello from UDP Server";
        buf = msg.getBytes();
        InetAddress adr = InetAddress.getByName("192.168.137.1");
        DatagramPacket dp = new DatagramPacket(buf, buf.length, adr, 95);
        ds.send(dp);
    }
}
