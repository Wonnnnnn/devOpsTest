package day9.연습문제;

import java.util.Arrays;

public class PersonDemo {
  public static void main(String[] args) {
    Person[] people = {
        new Person("손흥민", 20, 180, 70),
        new Person("홍길동", 32, 170, 75),
        new Person("박지성", 40, 175, 68)
    };

    System.out.println("정렬전");
    for (Person person : people) {
      System.out.println(person.toString());
    }
    Arrays.sort(people);
    System.out.println("정렬후");
    for (Person person : people) {
      System.out.println(person.toString());
    }

  }
}
