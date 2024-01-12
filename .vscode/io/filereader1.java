package io;
import java.io.*;
public class filereader1 {
    public static void main(String[] args)throws Exception
    {
        File dir = new File("pw");
        File file = new File(dir, "pw1.txt");
        FileReader fr = new FileReader(file);
        int i= fr.read();
       //System.out.println((char)i); // printing first letter only

       while(i!=-1)
       {
        System.out.print(i + "----->");
        System.out.println((char)i );
        i= fr.read();
        //fr.close();
       }
        


    }
    
}
