import java.util.*;
public class C_ArrayDeque

{
    public static void main(String[] args) {
        ArrayDeque ad =new ArrayDeque();
        ad.add(100);
        ad.add(200);
        ad.add(300);
        
        System.out.println(ad);
        //System.out.println( ad.add(ad));
        ad.addFirst(1000);
        ad.addLast(900);
        System.out.println(ad);
        ad.offerFirst(600);
        ad.offerLast(700);
        System.err.println(ad);

    }
}