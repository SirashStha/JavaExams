package File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingToFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text you want to write in file: ");
        String txt = sc.nextLine();
        FileWriter fw = new FileWriter("FileWrite.txt");
        fw.write(txt);
        System.out.println("Written in file successfully");
        fw.close();
    }
}
