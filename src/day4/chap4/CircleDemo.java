package day4.chap4;

public class CircleDemo {
  public static void main(String[] args) {
    Circle myCircle = new Circle(10);
    myCircle.findArea();
    myCircle.show();

    Circle yourCircle = new Circle("yellow");
    yourCircle.show();

    Circle c3 = new Circle(10,"red");
    c3.show();

    Circle c4 = new Circle();
    c4.show();
  }
}
