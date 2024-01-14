package practice;
//produce consumer problem-----


class queue {
    int x;

    public void put(int j)
    {
        x=j;
        System.out.println("i have produced the value"+x);
    }
    public void get()
    {
        System.out.println("i have consumed the value"+x);
    }

}

class producer extends Thread {
    queue q;

    public producer(queue a) {
        q = a;

    }

    public void run() {
        int i = 1;
        while (true) {
            q.put(i++);
        }
    }

}

class consumer extends Thread {
    queue q;

    public consumer(queue b) {
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

public class producer_consumer {
    public static void main(String[] args) {
        queue q = new queue();
    producer p = new producer(q);
    consumer c = new consumer(q);
    p.start();
    c.start();
    }
    
}
