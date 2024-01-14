package practice;
class Queue
{
    int x;
    boolean valueAtX=false;
    synchronized void put( int j)
    {
        try
        {
            if(valueAtX==true)
            {
                wait();
            }
            else
            {
                x=j;
                System.out.println("i have produced the value at x "+x);
                valueAtX=true;
                notify();

            }
        }
        catch(Exception e)
        {
            System.out.println("error " +e);
        }
    } 
    synchronized void get()
    {
        try
        {
            if(valueAtX=false)

            {
                wait();
            }
            else
            {
                System.out.println("i have consumed the value from x "+x);
                valueAtX=false;
                notify();
            }
        }
        catch(Exception c)
        {
            System.out.println("error "+c);
        }
    }
}
class producer1 extends Thread
{
    Queue Q;
    producer1(Queue a)
    {
        Q=a;

    }
    public void run()
    {
        int i=0;
        while(true)
        {
            Q.put(i++);

        }

    }
}
class consumer1 extends Thread
{
    Queue Q;
     consumer1(Queue b)
    {
        Q=b;
    }
    public void run()
    {
        while(true)
        {
            Q.get();
        }
    }
}
public class producer_consumerSol
{
    public static void main(String[] args) {
        Queue Q = new Queue();
        producer1 p = new producer1(Q);
        consumer1 c = new consumer1(Q);
        p.start();
        c.start();

    }
}