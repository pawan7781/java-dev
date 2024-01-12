import java.util.*;
public class C_ArrayList
{
    public static void main(String[] args) {
        ArrayList al =new ArrayList();
        al.add(20);
        al.add(30);
        al.add(60);
        System.out.println(al);
        al.add(300);
        System.out.println(al);

        ArrayList al2 =new ArrayList();
        al2.add(210);
        al2.add(3);
        al2.add(6);
        al2.addAll(al);
        System.out.println(al2);

        System.out.println(al.contains(30));
        System.out.println(al.indexOf(20));
        al.ensureCapacity(10);
        System.out.println(al.size());
        al.trimToSize();
        System.out.println(al.size());
        al.clear();
        System.out.println(al);
        List al3= new ArrayList();
        al3.add(100);
        System.out.println(al3);


    }
}