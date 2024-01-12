import java.util.WeakHashMap;

class Employee
{
    private String name;
    private int empid;
    public Employee(String name, int empid) {
        this.name = name;
        this.empid = empid;
    }
    public String toString()
    {
        return empid +" ";

    }
    @Override
    public void finalize()
    {
        System.out.println("clean up work by garbage collector before deallocating memory from heap");
    }


    

}
    public class WeakHM {
    
        public static void main(String[] args) {
            
            Employee e = new Employee("pawan", 100);
            WeakHashMap wh = new WeakHashMap();
            wh.put(e, "pawan"); 
            System.out.println(wh);
            e = null;// eligible for gc
            System.gc();// invoking gc
            System.out.println(wh);
            System.out.println("last line");

        }
}
