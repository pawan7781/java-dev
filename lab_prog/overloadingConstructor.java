class constructor
{
    private String brand;
    private String model;
    constructor()
    {
        System.out.println(" brand and model  ");
        brand="flair ";
        model="writo meter";
    }
    constructor(String brand, String model)
    {
        this.brand=brand;
        this.model=model;
    }
    constructor(String brand)
    {
        this.brand=brand;
        model=" linc";
    }
    public void show()
    {
        System.out.println(brand + model);
    }
}
public class overloadingConstructor {
    public static void main(String [] args)
    {
        constructor cons = new constructor();
        cons.show();
        constructor const1 = new constructor("elkos ", "brighter");
        const1.show();
        constructor construct = new constructor("starline");
        construct.show();
    }
    
}
