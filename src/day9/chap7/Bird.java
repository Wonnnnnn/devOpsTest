package day9.chap7;

public interface Bird {

  default void move() {
    System.out.println("새가 움직인다.");
  }
}
