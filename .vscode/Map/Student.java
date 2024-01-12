package Map;
import java.util.*;
import java.util.Map.*;
    class abc {
    private String name;
    private int age;
    private String city;
    public abc(String name, int age, String city)
    {
        this.name= name;
        this.age= age;
        this.city= city;

    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCity() {
        return city;
    }
    public String toString()
    {
        return name +" "+ age +" "+ city;
    }
    
}
public class Student
{
    public static void main(String[] args) {
        abc st1 = new abc("msd", 42, "chennai");
        abc st2 = new abc("virat", 35, "bangluru");

        Map map = new HashMap();
        map.put(1, st1);
        map.put(2, st2);
        System.out.println(map);
        Set s = map.entrySet();
        Iterator itr = s.iterator();
        while(itr.hasNext())
        {
            Map.Entry data = (Entry)itr.next();
            System.out.println(data.getKey()+":"+data.getValue());
        }
    }
}
