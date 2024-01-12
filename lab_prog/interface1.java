package lab_prog;

interface computer
{
    void compile_code();
}
class laptop implements computer{
    public void compile_code()
    {
        System.out.println("error1");
    }
}
class abc1 implements computer{
    public void compile_code()
    {
        System.out.println("error2");
    }
}

public class interface1 {
    public void biuldpp(computer obj)
    {
        System.out.println("building app");
        obj.compile_code();
    }
    
}
