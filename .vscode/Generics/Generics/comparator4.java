package Generics;
import java.util.*;
class Student3
{
    int marks;
    int age;
    String name;

    public Student3(int marks , int age , String name)
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
public class comparator4 {
    public static void main(String[] args) {
        Student3 st1 = new Student3(45, 36, "rohit") ;
        Student3 st2 = new Student3(18, 34, "virat");
        Student3 st3 = new Student3 (7, 42, "dhoni");

       
        List<Student3> list1 = new ArrayList<Student3>();
        list1.add(st1);
        list1.add(st2);
        list1.add(st3);
         Collections.sort(list1, 
         (Student3 q, Student3 p)->
        {
            if(q.marks>p.marks)
            {
                return 1;
            }
            else{
                return -1;
            }
        }
        );
        System.out.println(list1);
    }
    
}
