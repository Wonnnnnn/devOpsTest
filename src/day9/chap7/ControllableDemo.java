package day9.chap7;

public class ControllableDemo {
  public static void main(String[] args) {
    Tv tv = new Tv();
    Computer com = new Computer();

    tv.Turnoff();
    tv.Turnon();
    tv.repair();

    com.Turnoff();
    com.Turnon();
    com.repair();
    Controllable.reset(); // static이라서 인ㅌ페이스로 써야함
  }
}
