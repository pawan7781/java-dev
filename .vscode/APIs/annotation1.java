package APIs;

import java.lang.annotation.*;
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface Cricketplayer
{
    String country()default "India";
    int age() default 33;
}
@Cricketplayer
class virat
{   
    @Cricketplayer
    private int innings;
    private int runs;

    public int getInnings()
    {
        return innings;
    }
    @Cricketplayer
    public void setInnings(int innings)
    {
        this.innings = innings;
    }

    public int getRuns()
    {
        return runs;
    }

    public void setRuns(int runs)
    {
        this.runs= runs;

    }
}
public class annotation1 {
    public static void main(String[] args) throws Exception
    {
        virat v = new virat();
        v.setInnings(500);
        v.setRuns(50000);
        
        System.out.println(v.getInnings()+" : "+v.getRuns());

        Class c=v.getClass();
        Annotation a = c.getAnnotation(Cricketplayer.class);
        Cricketplayer cp = (Cricketplayer)a;

        System.out.println( cp.country());
        System.out.println(cp.age());
        

    }
}
