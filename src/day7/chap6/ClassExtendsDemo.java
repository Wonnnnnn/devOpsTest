package day7.chap6;

public class ClassExtendsDemo {
  public static void main(String[] args) {
    Circle circle = new Circle();

    circle.findArea();
    circle.findRadius();

    Ball ball = new Ball("red");
    ball.findColor();
    ball.findvolume();
    ball.findArea();
    ball.findRadius();
  }
}
