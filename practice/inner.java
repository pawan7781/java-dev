package practice;

class outer
{
    public class inner2
    {
        public void run()
        {
            System.out.println("he is running");
        }
    }
}
public class inner {
    
   public static void main(String[] args) {
    
    // outer o = new outer();
    // outer.inner2 i = o.new inner2();
    new outer().new inner2().run();
    
   }

}
