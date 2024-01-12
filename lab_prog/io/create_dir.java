package io;

import java.io.File;

public class create_dir {
    public static void main(String[] args) {
        File dir = new File("pw");
        System.out.println( dir.exists());
        dir.mkdir();
        System.out.println(dir.exists());
    }
}
