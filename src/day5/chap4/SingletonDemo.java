package day5.chap4;

import day4.exercise.Circle;

public class SingletonDemo {
  public static void main(String[] args) {
    Singleton singleton = Singleton.getSingleton();
    Singleton singleton2 = Singleton.getSingleton();

    //do they have the same address?
    System.out.println(singleton);
    System.out.println(singleton2);

    Circle c1 = new Circle(3,"red");
    Circle c2 = new Circle(3,"white");

    System.out.println(c1);
    System.out.println(c2);
  }
}
