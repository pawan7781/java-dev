package multithreading;

class car implements Runnable 
{
    public void run()
    {
        try
        {
            System.out.println(Thread.currentThread().getName()+"enterd in parking");
            Thread.sleep(3000);
            synchronized(this)
            {
                System.out.println(Thread.currentThread().getName()+"got into car");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName()+"started the car");
                Thread.sleep(3000);
                System.out.println(Thread.currentThread().getName()+"come backed");
            }
        }
        catch(Exception e)
        {
            System.out.println("error 404"+e);
        }
    }
}  

public class Sysnchronization {
    public static void main(String[] args) {
        car c = new car();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);

        t1.setName("MSD ");
        t2.setName("ABD ");
        t3.setName("VK ");

        t1.start();
        t2.start();
        t3.start();

    }
}
