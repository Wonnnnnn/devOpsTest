package day10.연습문제;

public class Person {
  private String num;
  private String name;

  @Override
  public boolean equals(Object obj) {
    return ((obj instanceof Person p)?((this.name==p.name)&&(this.num == p.num)):false);
  }

  public Person(String num, String name){
    this.num = num;
    this.name = name;
  }
}
