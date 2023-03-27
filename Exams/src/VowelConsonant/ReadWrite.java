package VowelConsonant;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {
    public static void main(String[] args) throws IOException {
        try{
            FileReader fi = new FileReader("Hello.txt");
            FileWriter vowels = new FileWriter("Vowels.txt");
            FileWriter consonants = new FileWriter("Consonants.txt");
            int c = 0;
            while((c=fi.read()) != -1){
                char ch = (char)c;
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch == 'u'){
                    vowels.write(c);
                }
                else{
                    consonants.write(c);
                }

            }
            vowels.close();
            consonants.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
