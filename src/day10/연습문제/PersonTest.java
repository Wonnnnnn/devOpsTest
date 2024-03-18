package day10.연습문제;

public class PersonTest {
  public static void main(String[] args) {
    Person p1 = new Person("111111", "손흥민");
    Person p2 = new Person("111111", "홍길동");

    if(p1.equals(p2)){
      System.out.println("같은 사람이다");
    }else {
      System.out.println("다른 사람이다");
    }
  }
}
