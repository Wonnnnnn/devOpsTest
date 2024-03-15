package day9.연습문제;

abstract class Controller {
  boolean power;
  abstract String getName();

  void show() {
    if (this.power) {
      System.out.println(getName() + "가 켜졌습니다.");
    } else {
      System.out.println(getName() + "가 꺼졌습니다.");
    }
  }
  public Controller(boolean power) {
    this.power = power;
  }

}
