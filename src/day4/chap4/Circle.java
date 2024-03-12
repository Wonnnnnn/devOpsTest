package day4.chap4;

public class Circle {
  //필드, 메서드
  private int radius;
  String color;

  int getRadius() { // 점슨자
    return radius;
  }

  void setRadius(int radius2) {
    if (radius > 0) {
      this.radius = radius2;
    }
  }


  void findArea() {
    System.out.println(3.14*radius*radius);
  }

  double returnArea() {
    return 3.14 * (double)radius*radius;
  }

  void show() {
    System.out.printf("반지름은 %d, 넓이는 %f, 원의 색깔은 %s입니다.\n", this.radius, returnArea(),color);
  }
  //생성자
  Circle(int radius) {
//    if (radius > 0) {
//      this.radius = radius;
//    }
//    this.color = "white";
    this(radius, "white");
  }

  Circle(String color) {
/*    this.color = color;
    this.radius = 1;*/
    this(1,color);
  }

  Circle(int radius, String color) {
    this.color = color;
    if (radius > 0) {
      this.radius = radius;
    }
  }

  Circle() {
    this(1,"white");
  }
}
