package practice;

interface a
{
    void takeoff();
    void fly();
    default void landing()
    {
        System.out.println("aeroplane is landing");
    }
}
class cargoplane implements a
{
    public void takeoff()
    {
        System.out.println("cargoplane requires longer runway");
    }
    public void fly()
    {
        System.out.println("cargoplane flies at lower height");
    }
    public void alert()
    {
        System.out.println("this is alert for cargo plane.....");
    }
}
class passengerplane implements a
{
    public void takeoff()
    {
        System.out.println("passengerplane requires longer runway");
    }
    public void fly()
    {
        System.out.println("passengerplane flies at lower height");
    }   

}
class airport
{
    public void poly(a ref)
    {
        ref.fly();
        ref.takeoff();
        ref.landing();
    }
}

public class inter {
    public static void main(String[] args) {
       a c = new cargoplane();
       a p = new passengerplane();
       airport air = new airport();
       air.poly(p);
       air.poly(c);
      

    }
   
} 
