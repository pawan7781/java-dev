class car
{
    private engine eng;
    public car(engine eng)
    {
        this.eng=eng;

    }
    public void start()
    {
        eng.engine_start();
    }

}
class engine
{
    public void engine_start()
    {
        System.out.println("engine started");
    }
}

public class Abs_Inh_Poly {
    
    public static void main(String[] args) {
        
    engine e =new engine();
    car c = new car(e);
    c.start();
    }
    
}
