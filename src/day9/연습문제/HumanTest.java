package day9.연습문제;

public class HumanTest {
  public static void main(String[] args) {

    Student s = new Student(20);
    s.print();
    s.eat();

    Human p = new Worker();
    p.print();
    p.eat();
  }
}
