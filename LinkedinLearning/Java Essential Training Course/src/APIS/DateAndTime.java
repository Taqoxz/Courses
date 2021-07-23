package APIS;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAndTime {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        GregorianCalendar gc = new GregorianCalendar(2021,07,14);
        System.out.println(gc.getTime());

        Date d1 = gc.getTime();
        System.out.println(d1);

        gc.add(GregorianCalendar.DATE, 1);
        Date d2 = gc.getTime();
        System.out.println(d2);

        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(df.format(d2));

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        LocalDateTime ld = LocalDateTime.of(2021,07,14,9,22,50,30);
        System.out.println(ld);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/m/yyyy hh:mm:s.n");
        System.out.println(dtf.format(ld));
    }
}
