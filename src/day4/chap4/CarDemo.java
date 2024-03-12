package day4.chap4;

public class CarDemo {
  public static void main(String[] args) {
    Car c1 = new Car("아이오닉 6", "흰색");
    c1.setDirection("전진");
    c1.moving();

    Car c2 = new Car("소렌토","파란색");
    c2.setDirection("후진");
    c2.getwhatCar();
    c2.moving();

    Car c3 = new Car("모하비", "초록색");
    c3.getwhatCar();
    c3.setDirection("전진");
    c3.moving();
    c3.setDirection("후진");
    c3.moving();

    Car c4 = new Car("스포티지","회색");
    c4.setDirection("전진");
    c4.moving();
    c4.setColor("검정색");
    c4.moving();
  }
}
