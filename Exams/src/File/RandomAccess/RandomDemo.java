package File.RandomAccess;
import java.io.*;
public class RandomDemo{
    public static void main(String[] args) throws IOException {
        RandomAccessFile file = new RandomAccessFile("RandomAccess.txt", "rw");
        file.write("Hello World".getBytes());

        file.seek(0);

        byte[] bytes = new byte[22];
        file.read(bytes);
        for(byte bt : bytes) {
            System.out.print((char)bt);
        }
        file.close();
    }
}