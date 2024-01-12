package Generics;

class genA<T>
{
    T obj;

    public genA(T obj) {
        this.obj = obj;
    }
    void disp()
    {
        System.out.println("type of data is :"+ obj.getClass().getName());
    }
    public T getobj()
    {
        return obj;
    }

    
}
public class gen {
    public static void main(String[] args) {
        genA<Integer> g = new genA<Integer>(10);
        g.disp();
        System.out.println(g.getobj());
        System.out.println(".....................................");
        genA<String> g1 = new genA<String>("pw");
        g1.disp();
        System.out.println(g1.getobj());
    }
}
