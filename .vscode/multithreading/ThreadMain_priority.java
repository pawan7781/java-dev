package multithreading;

public class ThreadMain_priority 
{
    public static void main(String[] args) {
        
        System.out.println("main thread");
        System.out.println("before change");
        String name = Thread.currentThread().getName();
        System.out.println("the name of first thread "+name);
        System.out.println("the priority of thread is "+Thread.currentThread().getPriority());
        System.out.println("after changing");
        Thread t= Thread.currentThread();
        t.setName("pw");
        t.setPriority(2);
        String name1= Thread.currentThread().getName();
        System.out.println("the namee of main thread is "+name1);
        System.out.println("the priority of main thread is "+Thread.currentThread().getPriority());
    }  
}
