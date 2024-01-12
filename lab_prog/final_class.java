package lab_prog;

class animals
{
    final int age =19;
    final void sleep()
    {
        System.out.println("aniaml");
    }
}
class tiger extends animals{
    //void sleep final method cant override in child class
}
public class final_class {
    public static void main(String[] args) {
        tiger t =new tiger();
        t.sleep();
    }
}
