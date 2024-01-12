public class String_types {
    public static void main(String []args)
    {     //immutable (non changable)
        String brand = "laptop";                           
        System.out.println(brand);                           
        brand.concat("hp");                                     
        System.out.println(brand);                             

        //mutable (changeble)
        StringBuffer brand1 =new StringBuffer("physics");
        System.out.println(brand1);
        brand1.append("wallah");
        System.out.println(brand1);

    }
}
