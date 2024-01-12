package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class HM_LHM {
    public static void main(String[] args) {
        HashMap hm = new HashMap<>();
        hm.put(1, "rohit");
        hm.put(2, "shikhar");
        hm.put(3, "virat");
        hm.put(4, "raina");
        hm.put(5, "dhoni");
        hm.put(6, "jaddu");
        System.out.println(hm);
        hm.put("bccci", "india");
        hm.put("sachin", 10);
        hm.putIfAbsent(9, "sdjfhasbs");
        System.out.println(hm);

        //linked hashmap:-
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put('a', 450);
        lhm.put('b', "ramesh");
        lhm.put("two", 100);
        lhm.put(5, 500);
        System.out.println(lhm);
    
    }
}
