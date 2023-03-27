package UdpClientServer;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Client {
    public static void main(String[] args) throws SocketException {
        DatagramSocket ds = new DatagramSocket(95);
        byte[] buf = new byte[256];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);
        String received = new String(dp.getData());
        System.out.println("Received Packet: "+received);
    }
}
