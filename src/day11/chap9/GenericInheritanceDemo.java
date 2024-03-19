package day11.chap9;

import day10.chap9.Beer;
import day10.chap9.Beverage;
import day10.chap9.Boricha;

import java.util.ArrayList;

public class GenericInheritanceDemo {
  public static void main(String[] args) {
    ArrayList<Beverage> a = new ArrayList<>();
    System.out.println(a.size());
    a.add(new Beverage());
    a.add(new Beer());
    a.add(new Boricha());

    ArrayList<Beer> a1 = new ArrayList<>();

    beverageTest(a);
//    beverageTest(a1);
  }

  private static void beverageTest(ArrayList<Beverage> list){
    Beverage beverage = list.get(2);
    if(beverage instanceof Beer){
      System.out.println("맥주입니다.");
    } else if(beverage instanceof Boricha){
      System.out.println("보리차입니다.");
    } else if(beverage instanceof Beverage){
      System.out.println("음료입니다.");
    }

  }
}
