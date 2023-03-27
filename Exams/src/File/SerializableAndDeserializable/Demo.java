package File.SerializableAndDeserializable;

import java.io.*;

public class Demo {
    String s="Test Serializable and Deserializable";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Demo obj=new Demo();
        FileOutputStream fos = new FileOutputStream("Serialization.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        System.out.println("Serialization Completed");


        FileInputStream fis = new FileInputStream("Hello.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Demo obj2= (Demo) ois.readObject();
        System.out.println("Deserialization completed ");
        System.out.println(obj2.s);
    }

}
