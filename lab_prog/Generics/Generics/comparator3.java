package Generics;
import java.util.*;
class Student2
{
    int marks;
    int age;
    String name;

    public Student2(int marks , int age , String name)
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

}


public class comparator3 {
    public static void main(String[] args) {
        
        Student2 st1 = new Student2(45, 36, "rohit") ;
        Student2 st2 = new Student2(18, 34, "virat");
        Student2 st3 = new Student2 (7, 42, "dhoni");

        Comparator<Student2> cm = (Student2 q, Student2 p)->
        {
            if(q.marks>p.marks)
            {
                return 1;
            }
            else{
                return -1;
            }
        };
        List<Student2> list1 = new ArrayList<Student2>();
        list1.add(st1);
        list1.add(st2);
        list1.add(st3);
         Collections.sort(list1, cm);
        System.out.println(list1);
    }
    
}
