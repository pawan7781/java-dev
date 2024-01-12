package APIs;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTime1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month =date.getMonthValue();
        int day = date.getDayOfMonth();
        int year = date.getYear();

        System.out.println(day + ":"+ month +":"+ year);


        LocalTime time = LocalTime.now();
        time.getMinute();
        time.getSecond();
        time.getNano();
        time.getHour();
        System.out.println(time);

    }
}
