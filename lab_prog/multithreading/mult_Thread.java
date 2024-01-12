package multithreading;
import java.util.Scanner;
class calc extends Thread{
    public void run()
    {
        System.out.println("calculation started");
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 =sc.nextInt();
        System.out.println("enter the second number");
        int num2 = sc.nextInt();
        int result = num1+num2;
        System.out.println(("result is "+result));
        System.out.println("calculation ended");
        System.out.println("........................................................");
        sc.close();
    }
}
class message extends Thread{
    public void run()
    {
        System.out.println("displaying imp msg");
        try
        {
            for(int i=0; i<3; i++)
            {
                System.out.println("skills");
                Thread.sleep(2000);
            }
        }
        catch(Exception e){
            System.out.println("error");
        }
        System.out.println("displaying imp msg ended");

    }
}

public class mult_Thread {
    public static void main(String[] args) {
        System.out.println("execution Started from here");
        message m = new message();
        calc c = new calc();
        m.start();
        c.start();
    }
}
