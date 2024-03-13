package day7.chap5;

public class Exercise {
  //월요일~일요일 상수값을 가지는 eum class 생성
  //enum 타입의(요일을 가리키는) 변수를 선언하고 수요일로 초기화 하시오
  //switch를 써서 주중인지 주말인지 출력하는 프로그램을 완성하라.
  public static void main(String[] args) {
    Week week = Week.WEDS;

    switch (week) {
      case MON:
      case TUE:
      case WEDS:
      case THUR:
      case FRI:
        System.out.println(week+"요일은 주중입니다.");
        break;
      case SAT:
      case SUN:
        System.out.println(week+"요일은 주말입니다");
        break;
    }
  }

}
