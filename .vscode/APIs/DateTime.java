package APIs;
import java.util.Date;
//import java.sql.Date;
public class DateTime {
    public static void main(String[] args) {
        Date dt = new Date();
        System.out.println(dt);

        long timeInMin = dt.getTime();

        java.sql.Date dt1 = new java.sql.Date(timeInMin);
        System.out.println(dt1);
    }
}
