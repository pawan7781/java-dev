package lab_prog;


import java.util.Scanner;
public class eh_try_catch 
{
    public static void main(String[]args)
    {   Scanner scan = new Scanner(System.in);
        System.out.println("enter the value of n1 and n2");
        int n1=scan.nextInt();

        int n2=scan.nextInt();
        
        float result;
        try{
        result=n1/n2;
        System.out.println(result);
        }
        catch(Exception e){
            System.out.println("error 404"+e);
        }
        finally{
            scan.close();

        }


    }
    
}
