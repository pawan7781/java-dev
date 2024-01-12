package multithreading;
class myThread extends Thread{
    public void run()
    {
        System.out.println("child thread");
    }
}

public class creatingThread {
    public static void main(String[] args) {
        System.out.println("start1");
        myThread t =new myThread();
        t.start();
    }
}
