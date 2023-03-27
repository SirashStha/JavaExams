package TcpClientServer;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket cs = new Socket("localHost",95);
        Scanner sc = new Scanner(cs.getInputStream());
        String s = sc.nextLine();
        System.out.println("From Server: "+s);
        sc.close();
        cs.close();
    }
}
