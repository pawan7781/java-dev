package io;
import java.io.*;
import java.lang.*;


public class filewriter1 
{
    public static void main(String[] args) throws Exception
    {
    
    File dir = new File("pw");
    File file = new File(dir, "pw1.txt");
    FileWriter fw = new FileWriter(file, true);
    fw.write("java");
    fw.write("\n");
    fw.write(65);
    fw.write("\n");
    fw.write(97);
    fw.write("\n");
    fw.write("core");
    fw.write("\n");
    fw.write('z');
    fw.write("\n");
    fw.write(96);
    

    char ch[]= {'q','w','e','r','t'};

    fw.write(ch);
    fw.close();
    }

}
