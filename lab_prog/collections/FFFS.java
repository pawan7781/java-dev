import java.util.*;
import java.util.concurrent.*;
public class FFFS {
    public static void main(String[] args) {
        //failfast:-
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(241);
        al.add(456);
        al.add(524);
        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
            al.add(600);

        }
        //failsafe:-
        CopyOnWriteArrayList al1 = new CopyOnWriteArrayList();
        al1.add(200);
        al1.add(800);
        al1.add(200);
        al1.add(300);
        System.out.println(al1);
        Iterator itr1 = al1.iterator();
        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
            al1.add(10000);
        }
        
        
    }
}
