package day9.연습문제;

public class Student implements Human{

  int age;
  @Override
  public void eat() {
    System.out.println("도시락을 먹습니다.");
  }

  @Override
  public void print() {
    System.out.println(age+"세의 학생입니다.");
  }

  public Student(int age){
    this.age = age;
  }
}
