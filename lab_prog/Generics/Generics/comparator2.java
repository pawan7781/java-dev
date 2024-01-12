package Generics;
import java.util.*;
class Student1
{
    int marks;
    int age;
    String name;

    public Student1(int marks , int age , String name)
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


public class comparator2 {
    public static void main(String[] args) {
        
        Student1 st1 = new Student1(45, 36, "rohit") ;
        Student1 st2 = new Student1(18, 34, "virat");
        Student1 st3 = new Student1 (7, 42, "dhoni");

        //Alpha a = new Alpha();
        Comparator<Student1> cm = new Comparator<Student1>() 
        {
            public int compare(Student1 q , Student1 p)
            {
                if(q.age>p.age)
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
            
        };

        List<Student1> list = new ArrayList<Student1>();
        list.add(st1);
        list.add(st3);
        list.add(st2);

        Collections.sort(list, cm);
        System.out.println(list);
    }
}
