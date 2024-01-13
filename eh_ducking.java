




class demo
{
    public void a() throws Exception
    {
        b();

    }
    public void b() throws Exception{
        int n1= 10;
        int n2= 0;
        int result = n1/n2;
        System.out.println(result);

    }
}
public class eh_ducking {
    public static void main(String[] args) {
        demo obj = new demo();
        try
        {
            obj.a();

        }
        catch(Exception ex)

        {
            System.out.println("error found!"+ex);
        }
    }
    
}
