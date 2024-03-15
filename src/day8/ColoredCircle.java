package day8;

public class ColoredCircle extends Circle{
  String Color;

  public void show() {
    System.out.println("반지름이 " + radius + "인 " + Color + " 원이다.");
  }

  void coloredCircle(int radius, String Color) {
    this.radius = radius;
    this.Color = Color;
  }
}
