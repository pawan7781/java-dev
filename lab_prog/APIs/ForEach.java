package APIs;

import java.util.*;
//import java.util.function.*;

public class ForEach {
    public static void main(String[] args) {
        
        List<Integer> l1 = Arrays.asList(5,9,6,4,7,2);
        System.out.println(l1);

        //using consumer interface:-

    //     Consumer<Integer> cm = new Consumer<Integer>();
    //     {   
    //         @Override
    //         public void accept(Integer i)
    //         {
    //             System.out.println(i);
    //         }
    //     };
    //     l1.forEach(cm);
        //-------------------
    // Consumer<Integer> cons = i-> System.out.println(i);
    
    // l1.forEach(cons);

        //---------------------------
        
        l1.forEach(n->System.out.println(n));


    }

    
}
