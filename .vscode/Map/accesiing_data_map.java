package Map;
import java.util.Map.*;
//import java.util.Collection;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Set;
import java.util.*;

public class accesiing_data_map {
    public static void main(String[] args) {
        
            Map map1= new HashMap();
            map1.put(1, "rohit");
            map1.put(2, "shikhar");
            map1.put(3, "virat");
            map1.put(4, "raina");
            map1.put(5, "dhoni");
            map1.put(6, "jaddu");
            System.out.println(map1);
            Set s1 = map1.keySet();
            Iterator itr =s1.iterator();
            while(itr.hasNext())
            {
                System.out.println(itr.next());
            }
            Collection c1 = map1.values();
             
            Iterator itr1 = c1.iterator();
            
            while(itr1.hasNext())
            {
                System.out.println(itr1.next());
                Integer value = (Integer)itr1.next();
                System.out.println(value);
            }

            Set Es = map1.entrySet();
            Iterator itr2 = Es.iterator();
            while(itr2.hasNext());
            {
                //System.out.println(itr2.next());
                Map.Entry data =(Entry)itr2.next();
                System.out.println(data.getKey()+":"+data.getValue());
            }
            


        }
    }

