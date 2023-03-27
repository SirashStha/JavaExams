package TcpClientServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(95);
        Socket cs = ss.accept();
        PrintWriter out = new PrintWriter(cs.getOutputStream(),true);
        out.println("Hello Client");
        out.close();
        cs.close();
        ss.close();
    }
}
