package io;
import java.io.*;
import java.io.FileInputStream;
class Cricketer implements Serializable
{
    private String name;
    private int age;
    private int runs;

    public Cricketer(String name, int age, int runs)
    {
        this.name = name;
        this.age= age;
        this.runs =runs;
    }

    public void disp()
    {
        System.out.println(name +":"+age+":"+runs);
    }
}
public class dserialization1 {

    public static void main(String[] args)throws Exception
    {
        FileInputStream fis = new FileInputStream("pw.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        ObjectInputStream ois = new ObjectInputStream(bis);
        //Cricketer c = new Cricketer(, 0, 0)
        Cricketer c =(Cricketer)ois.readObject();
        //c.disp();
        ois.close();
        //ois.flush();
    }
    
}
