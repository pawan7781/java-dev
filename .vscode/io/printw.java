package io;
import java.io.*;
public class printw {
    
    public static void main(String[] args) {
        
        File dir = new File("pw");
        File file = new File(dir, "pw1.txt");
        try{
        FileWriter fw= new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(85);
        pw.println(8.35);
        pw.println("pw");
        pw.println("java");
        pw.println(true);
        //pw.println(null);
        pw.println('b');
        pw.println();

        pw.close();


        }
        catch(Exception e)
        {
            System.out.println(e);
        }


    }
}
