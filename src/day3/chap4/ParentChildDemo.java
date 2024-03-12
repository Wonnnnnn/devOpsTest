package day3.chap4;

public class ParentChildDemo {
  public static void main(String[] args) {
    Animal a1 = new Animal();
    Animal a2 = new Animal();
    Tiger t1 = new Tiger();
    Bird b1 = new Bird();

    a1.move();
    a1.eat();
    a2.move();
    a2.eat();
    t1.move();
    t1.eat();
    b1.move();
    b1.eat();
  }

}
