package day8;

public class Circle {
  int radius;

  public void show() {
    System.out.println("반지름이" + radius + "인 원이다.");
  }

  public void circle(int radius) {
     this.radius = radius;
  }
}
