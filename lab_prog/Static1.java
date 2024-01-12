package lab_prog;

class prime1
{
   
    static int n;
    public static boolean isPrime(int n)
    {
        {
            if(n==2)
                return true;
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                    return false;
            }
            return true;
        }
       
        }
    }


public class Static1 {
    public static void main(String[] args) {
        
            //int n;
            for(int i=2;i<=prime1.n;i++)
            {
                if(prime1.isPrime(i))//true
                  System.out.println(i+" ");
            }
            System.out.println();

            System.out.println(prime1.isPrime(20));
        }
    }
    


