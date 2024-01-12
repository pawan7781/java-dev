package io;
import java.io.*;
public class create_file {
    
    public static void main(String[] args)
     {
        File fi = new File("pw.txt");
        System.out.println(fi.exists());
        try{
        fi.createNewFile();
        }
        catch(Exception e)
        {
            System.out.println("exception occured");
        }
        finally{
            System.out.println(fi.exists());
        }
    }
}
