package io;
import java.io.*;
import java.io.FileOutputStream;
class Cricketer implements Serializable
{
    private String name;
    private int age;
    private int runs;
    public Cricketer(String name, int age, int runs) {
        this.name = name;
        this.age = age;
        this.runs = runs;
    }
}
public class serialization1 {
    public static void main(String[] args) {
        try{
            Cricketer c = new Cricketer("msd",42, 17000);
            FileOutputStream fos = new FileOutputStream("pw.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos);

            oos.writeObject(c);
            oos.close();



        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}
