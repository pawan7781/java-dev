package multithreading;

class liabrary implements Runnable {
    String res1 = new String("java");
    String res2 = new String("cpp");
    String res3 = new String("kotlin");

    public void run()
    {
        String name =Thread.currentThread(). getName();
        if(name.equals("student 1"));
        {
            try
            {
                Thread.sleep(3000);
                synchronized(res1)
                {
                    System.out.println("Student 1 has account"+res1);
                    Thread.sleep(3000);
                    synchronized(res2)
                    {
                        System.out.println("Student 2 has account"+res2);
                        Thread.sleep(3000);   
                        synchronized(res3)
                        {
                            System.out.println("Student 1 has account"+res1);
                            Thread.sleep(3000);
                        }
                    }   
                }
            }
            catch(Exception e)
            {
                System.out.println("error");
            }
        }
        else
            {
            try{
            Thread.sleep(3000);
                synchronized(res3)
                {
                    System.out.println("student 2 has account"+res3);
                    Thread.sleep(3000);
                    synchronized(res2)
                    {
                        System.out.println("student 2 has access"+res2);
                        Thread.sleep(3000);
                        synchronized(res1)
                        {
                            System.out.println("student 2 has access"+res3);
                            Thread.sleep(3000);
                            
                        }
                    }
                }
            }
            catch(Exception e)
            {
                System.out.println("error found!");
            }
        }
    }
}

public class deadlock {
    public static void main(String[] args) {
        liabrary lib = new liabrary();
        Thread t1 = new Thread(lib);
        Thread t2 = new Thread(lib);
        t1.setName("student 1");
        t2.setName("student 2");
    }
}
