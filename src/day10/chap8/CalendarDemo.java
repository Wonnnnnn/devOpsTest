package day10.chap8;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
  public static void main(String[] args) {
    Date date = new Date();
    System.out.println(date);

    Calendar calendar = Calendar.getInstance();
    //System.out.println(calendar);
    System.out.println(calendar.AM);
    System.out.println(calendar.MONTH);
    System.out.println(calendar.get(calendar.HOUR));
  }
}
