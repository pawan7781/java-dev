package lab_prog;

class abc
{
    private int collegeID;
    private String collegeName;
    abc()//default
    {
        System.out.println("default constructor called");
    }
    abc(int collegeID , String collegeName)
    {
        this.collegeID=collegeID;
        this.collegeName=collegeName;
    }
    void disp()
    {
       System.out.println(collegeID);
    }
    void display()
    {
        System.out.println(collegeName);
    }

}
public class constructorA {
    public static void main(String [] args)
    {
        abc a =new abc();
        a.disp();
        a.display();
        abc b= new abc(133, "SIRTBhopal");
        b.disp();
        b.display();
    }
    
}
