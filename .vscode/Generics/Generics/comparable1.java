package Generics;
import java.util.*;
class Student6 implements Comparable<Student6>

{
    int marks;
    int age;
    String name;

    public Student6(int marks , int age , String name)
    {
        this.marks= marks;
        this.age = age;
        this.name = name;
    }

    public int getMarks()
    {
        return marks;

    }
    public int getAge()
    {
        return age;

    }
    public String getName()
    {
        return name;
    }
    public String toString()
    {
        return " "+ marks+ "-"+ age+"-"+name;
    }
    public int compareTo(Student6 s)
    {
        if(this.age>s.age)
        {
            return 1;

        }
        else{
            return -1;
        }
    }

}




public class comparable1 {
    public static void main(String[] args) {
         
        {
            Student6 st1 = new Student6(45, 36, "rohit") ;
            Student6 st2 = new Student6(18, 34, "virat");
            Student6 st3 = new Student6 (7, 42, "dhoni");
    
           
            List<Student6> list1 = new ArrayList<Student6>();
            list1.add(st1);
            list1.add(st2);
            list1.add(st3);
            Collections.sort(list1);
            System.out.println(list1);
        }
        
    }
}
