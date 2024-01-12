package Map;

//import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class HT_TM
{
    public static void main(String[] args) {
        Hashtable hm = new Hashtable();
        hm.put(5, "pawan");
        hm.put(6, "kunal");
        hm.put(9, 9000);
        //hm.put(null, null); not accepting null values
        System.out.println(hm);
        hm.putIfAbsent(10, 1000000);
        System.out.println(hm);

        TreeMap tm = new TreeMap();
        tm.put(4, 9);
        tm.put(88, 44);
        tm.put(33, "ram");
        System.out.println(tm);
        tm.putIfAbsent(858, 4564);
        System.out.println(tm);



    }
}