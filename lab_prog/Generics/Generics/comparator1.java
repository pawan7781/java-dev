package Generics;
import java.util.*;
class Student
{
    int marks;
    int age;
    String name;

    public Student(int marks , int age , String name)
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


class Alpha implements Comparator<Student>
{
    public int compare(Student q, Student p)
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

    // @Override
    // public int compare(Student q, Student p) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'compare'");
}


public class comparator1
{
    public static void main(String[] args) {
        Student st1 = new Student(45, 36, "rohit") ;
        Student st2 = new Student(18, 34, "virat");
        Student st3 = new Student (7, 42, "dhoni");

        Alpha a = new Alpha();

        List<Student> list = new ArrayList<Student>();
        list.add(st1);
        list.add(st3);
        list.add(st2);

        Collections.sort(list, a);
        System.out.println(list);

    }
}