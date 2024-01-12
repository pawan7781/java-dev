package Generics;
import java.util.*;

import java.util.ArrayList;

public class inbuiltfn {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(100);
        al.add(200);
        al.add(800);
        al.add(900);
        al.add(700);
        al.add(400);
        al.add(600);
        
        int index = Collections.binarySearch(al, 900);
        System.out.println("index is :"+ index);

        Collections.shuffle(al);
        System.out.println(al);

        Collections.rotate(al, 2);
        System.out.println(al);

        System.out.println(Collections.frequency(al, 900));


    }
}
