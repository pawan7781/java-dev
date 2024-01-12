package io;
import java.io.*;
public class filereader2 {
    public static void main(String[] args)throws Exception {
        
        File dir = new File("pw");
        File file = new File(dir, "pw1.txt");
        FileReader fr2 = new FileReader(file);

        char ch[]=new char[(int)file.length()];
        fr2.read(ch);
        for (char i : ch) {
            System.out.println(i);
            
        }


    }
}
