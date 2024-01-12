package io;
import java.io.*;

public class frwr {
    public static void main(String[] args) {
        File dir = new File("pw");
        File f = new File("pw1.txt");
        try{
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        String s=br.readLine();

        while(s!=null)
        {
            System.out.println(s);
            s= br.readLine();

        }


        }
        catch(Exception r)
        {
            System.out.println(r);
        }
    }
}
