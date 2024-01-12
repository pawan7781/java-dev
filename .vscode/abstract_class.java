abstract class aeroplane
{
    abstract public void takeoff();
    abstract public void fly();
    public void landing()
    {
        System.out.println("aeroplane is landing");
    }
}

class cargoplane extends aeroplane
{
    public void takeoff()
    {
        System.out.println("cargo is taking off");
    }
    public void fly()
    {
        System.out.println("cargo flying");
    }
}
class passengerp extends aeroplane
{
    public void takeoff()
    {
        System.out.println("paassengerp takiinf off");

    }
    public void fly()
    {
        System.out.println("passengerp flying");

    }
    public void alert()
    {
        System.out.println("alert..");
    }
}

public class abstract_class {
    public static void main(String [] args)
    {
        aeroplane ref =new cargoplane();
        ref.fly();
        ref.takeoff();
        ref.landing();
        aeroplane ref1 = new passengerp();
        ref1.fly();
        ref1.takeoff();
        ref1.landing();
        ((passengerp)ref1).alert();

    }
}
