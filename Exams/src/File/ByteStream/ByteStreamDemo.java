package File.ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("Hello.txt");
        FileOutputStream fos = new FileOutputStream("ByteStream.txt");
        int c =0;

        while((c = fis.read()) != -1) {
            fos.write(c);
        }

        fos.close();
        fis.close();
    }
}
