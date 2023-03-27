package File.CharaterStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("Hello.txt");
        FileWriter fw = new FileWriter("CharacterStream.txt");
        int c;
        while((c=fr.read())!=-1) {
            fw.write(c);
        }
        fw.close();
        fr.close();
    }
}
