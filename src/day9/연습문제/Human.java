package day9.연습문제;

public interface Human {
  void eat();
  void print();
  default void echo(){
    System.out.println("야호!!");
  }
}
