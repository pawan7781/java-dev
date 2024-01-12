package APIs;
import java.util.*;
import java.util.stream.*;
import java.util.Map;
public class Streamapi {
    public static void main(String[] args) {
        List<Integer>l1= Arrays.asList(8,6,3,2,4,17);

        Stream<Integer> s1 = l1.stream();

        // Stream<Integer> filterd = s1.filter(n->n%2==0);
        // Stream<Integer> sortd = filterd.sorted();
        // Stream<Integer> maps = sortd.map(n->n*2);

        // maps.forEach(n->System.out.println(n));

        //another method:-

        Stream<Integer> finalStream = s1.filter(n->n%2==0).sorted().map(n->n*2);
        finalStream.forEach(n->System.out.println(n));

    }
}
