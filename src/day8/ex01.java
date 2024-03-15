package day8;

public class ex01 {
  public static void main(String[] args) {
    Circle c1 = new Circle();
    ColoredCircle c2 = new ColoredCircle();

    c1.circle(5);
    c2.coloredCircle(10, "빨간색");

    c1.show();
    c2.show();
  }
}
