class aeroplane
{
    public void takeoff()
    {
        System.out.println("plane is taking off");
    }
    public void fly()
    {
        System.out.println("plane is flying");
    }
}
class cargoPlane extends aeroplane
{
    public void takeoff()
    {
        System.out.println("cargo is taking off");
    }
    public void fly()
    {
        System.out.println("cargo is flying");
    }
}
class passengerPlane extends aeroplane
{
    public void takeoff()
    {
        System.out.println("passengerplane is taking off");
    }
    public void flying()
    {
        System.out.println("passengerplane is flying");
    }
}
class fighterplane extends aeroplane
{
    public void takeoff()
    {
        System.out.println("fighter plane is taking off");
    }
    public void fly()
    {
        System.out.println("fighterplane is taking off");
    }
}
class airport

{
    public void polym(aeroplane ref)
    {
        System.out.println("..........................................");
        ref.takeoff();
        ref.fly();
        System.out.println("..........................................");
    }
}
public class method_overriding 
{
    public static void main(String [] args)
    {
        cargoPlane cp = new cargoPlane();
        passengerPlane pp = new passengerPlane();
        fighterplane fp = new fighterplane();
        airport a = new airport();
        a.polym(cp);
        a.polym(pp);
        a.polym(fp);
    }
    
}
