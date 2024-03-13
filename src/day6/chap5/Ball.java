package day6.chap5;

public class Ball {
  int radius;
  String color;

  void print() {
    System.out.printf("반지름이 %d이고 색은 %s인 공입니다.\n",radius,color);
  }

  public Ball(int radius, String color) {
    this.radius = radius;
    this.color = color;
  }
}
