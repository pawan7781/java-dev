package io;

import java.io.File;


public class filef {
    public static void main(String[] args)throws Exception 
    {
        int count =0;
        File f= new File("pw.txt");
        String str[] = f.list();
        for(String name : str)
        {
            count++;
            System.out.println(name);

        }
        System.out.println(count++);
    }
}
