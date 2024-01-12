package lab_prog;
import java.util.Scanner;
public class eh_throw {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("enter two numbers");
        int num =scan.nextInt();
        int num2=scan.nextInt();
        try{
            if(num2<0 || num<0)
            {
                Exception e = new Exception("remove negative sign");
                throw e;

            }
            else{
                int result = num/num2;
                System.out.println(result);
            }
        }
        catch(Exception e)
        {
            System.out.println("enter valid number" +e);
        }
        finally
        {
            scan.close();
        }
    }
}
