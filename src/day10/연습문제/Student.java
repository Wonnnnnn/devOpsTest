package day10.연습문제;

public class Student {
  String name;

  @Override
  public String toString() {
    return "학생["+ name +"]";
  }

  public Student(String name){
    this.name = name;
  }
}
