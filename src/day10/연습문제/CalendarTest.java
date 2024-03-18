package day10.연습문제;

import java.util.Calendar;

public class CalendarTest {
  public static void main(String[] args) {
    String[] weekName = {"일", "월", "화", "수", "목", "금", "토"};
    String[] noonName = {"오전","오후"};
    Calendar calendar = Calendar.getInstance();
    int year, month, day, hour, minute, second;
    String week, noon;

    year = calendar.get(Calendar.YEAR);
    month = calendar.get(Calendar.MONTH)+1;
    day = calendar.get(Calendar.DAY_OF_MONTH);
    week = weekName[calendar.get(Calendar.DAY_OF_WEEK)-1];
    noon = noonName[calendar.get(Calendar.AM_PM)];
    hour = calendar.get(Calendar.HOUR);
    minute = calendar.get(Calendar.MINUTE);
    second = calendar.get(Calendar.SECOND);


    System.out.println(year + "년 "+month+"월 "+day+"일");
    System.out.println(week+"요일 "+noon);
    System.out.println(hour+"시 "+minute+"분 "+second+"초");
  }
}
