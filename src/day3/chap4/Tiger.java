package day3.chap4;

public class Tiger extends Animal{
  @Override
  void move() {
    System.out.println("달린다.");
  }

  @Override
  void eat() {
    System.out.println("동물을 먹는다.");
  }
  /*int legs = 4;

  void eat() {
    System.out.println("동물을 먹는다.");
  }

  void move() {
    System.out.println("달린다.");
  }*/
}
