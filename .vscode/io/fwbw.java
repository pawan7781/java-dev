package io;

import java.io.FileWriter;
import java.io.*;
public class fwbw {

    public static void main(String[] args) {
        File dir = new File("pw");
        File f = new File("pw1.txt");
        try{
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("java");
        bw.newLine();
        bw.write("hello");
        bw.newLine();
        bw.write(97);
        bw.newLine();
        bw.write(65);
        bw.newLine();
        bw.write('w');
        bw.newLine();
        char ch[]= {'l','h','g'};
        bw.write(ch);

        bw.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
       
    }
    
}
