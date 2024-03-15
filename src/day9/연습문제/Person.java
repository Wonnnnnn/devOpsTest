package day9.연습문제;

public class Person implements Comparable{
  String name;
  int age;
  int height;
  int weight;

  @Override
  public int compareTo(Object o) {
    if(o instanceof Person p){
      return  p.age - this.age;
    }
    return  -999;
  }

  @Override
  public String toString() {
    return "Book [이름 = "+name+", 나이 = "+age + ", 키 = " + height + ", 몸무게 = " + weight + "]";
  }

  public Person(String name, int age, int height,int weight){
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.height = height;
  }
}
