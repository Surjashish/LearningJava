package coreJava.SerializationDeSerialization;

import java.io.*;

class Save implements Serializable
{
    int i;
}
public class SerialDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Save s=new Save();
        s.i=5;

        //Serialization
        File f=new File("object.txt");
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos= new ObjectOutputStream(fos);
        oos.writeObject(s);

        //Deserialization
        FileInputStream fileInputStream=new FileInputStream("object.txt");
        ObjectInputStream ois=new ObjectInputStream(fileInputStream);
        Save obj1= (Save) ois.readObject();
        System.out.println("Value of obj1 = "+obj1.i);

    }
}
