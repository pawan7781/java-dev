package multithreading;
class queue
{
    int x;
    boolean valueAtX= false;
    synchronized public void put(int j)
    {
        try
        {
            if(valueAtX==true)
            {
                wait();

            }
            else{
                x=j;
                System.out.println("i have produced the value "+x);
                valueAtX = true;
                notify();
            }
        }
        catch(Exception e)
        {
            System.out.println("error 404!" +e);
        }
    }
    synchronized public void get()
    {
        try
        {
            if(valueAtX==false)
            {
                wait();

            }
            else{
                
                System.out.println("i have consumed the value "+x);
                valueAtX = false;
                notify();
            }
        }
        catch(Exception e)
        {
            System.out.println("consumer class error occured 404!" +e);
        }

    }
}
class producer extends Thread
{
    queue q;
    producer(queue a)
    {
        q=a;
    }
    public void run()
    {
        int i=1;
        while(true)
        {
        q.put(i++);
        }

    }

}
class consumer extends Thread
{
    queue q;
    consumer(queue b)
    {
        q=b;
    }
    public void run()
    {
        while(true)
        {
        q.get();
        }
    }
}
public class pro_cons 
{
    public static void main(String[] args)
    {
        
    queue q = new queue();

    producer p = new producer(q);
    consumer c = new consumer(q);
    
    p.start();
    c.start();
    }


    
}
