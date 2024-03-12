package day3.chap4;

public class Bird extends Animal {
//  int legs = 2;
  int wings = 2;

  @Override
  void move() {
    System.out.println("난다.");
  }

  @Override
  void eat() {
    System.out.println("벌레를 먹는다.");
  }
  //
//  void eat() {
//    System.out.println("벌레를 먹는다.");
//  }
//
//  void move() {
//    System.out.println("난다.");
//  }
}
