import java.util.Scanner;
class loanfarmer
{
    int principle_amount;
    float time_duration;
    static float rate;
    float simple_interest;

    static
    {
        rate=2.5f;
    }

    void input()
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the amount you want to apply for loan");
        principle_amount=scan.nextInt();
        System.out.println("enter the time duration");
        time_duration=scan.nextFloat();
    }
    void calculate()
    {
        simple_interest=(principle_amount*rate*time_duration)/100f;
        System.out.println("simple interest of loan is" +simple_interest);
    }
}
class loanapp
{
    public static void main(String[] args)
    {
       loanfarmer loan1 = new loanfarmer();
       loan1.input();
       loan1.calculate();
       loanfarmer loan2 = new loanfarmer();
       loan2.input();
       loan2.calculate();
    }
}