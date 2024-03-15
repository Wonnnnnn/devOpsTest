package day9.chap7;

public class MovableDemo {
  public static void main(String[] args) {
    Movable m = new  Car();
    m.move();

    Car c1 = (Car)m;
    c1.move();

    Car c = new Car();
    c.move();
    c.show();
    c.move();
    c.show();
  }
}
