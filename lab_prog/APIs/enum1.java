package APIs;

enum Week
{
    MON, TUE, WED, THU, FRI, SAT, SUN
}


public class enum1 {
    enum result
    {
        PASS, FAIL, NR, SUP;
    }
    public static void main(String[] args) {
       
        Week w = Week.MON;
        System.out.println(w);

        System.out.println( Week.MON.ordinal());

        Week []wr = Week.values();
        for (Week week1 : wr) {
            System.out.println(week1 + ":" + week1.ordinal());
        }

    }
}
