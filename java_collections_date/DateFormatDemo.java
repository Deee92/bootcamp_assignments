/**
 * Question 8: Write a program to format date as "21-March-2016"
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormatDemo {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMMM-yyyy");
        Calendar calendar = Calendar.getInstance();
        System.out.println("The date today: " + simpleDateFormat.format(calendar.getTime()));
    }
}
