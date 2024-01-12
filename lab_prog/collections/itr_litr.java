import java.util.*;

//import javax.swing.text.html.HTMLDocument.Iterator;
public class itr_litr {
    public static void main(String[] args) {
        ArrayList ar1 = new ArrayList();
        ar1.add(200);
        ar1.add(500);
        ar1.add(600);
        ar1.add(9000);
        System.out.println(ar1);
        Iterator itr = ar1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        ListIterator litr = ar1.listIterator(ar1.size());
        while(litr.hasPrevious())
        {
            System.out.println(litr.previous());
        }
        
    }
}
