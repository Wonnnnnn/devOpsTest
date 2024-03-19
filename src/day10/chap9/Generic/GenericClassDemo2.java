package day10.chap9.Generic;

public class GenericClassDemo2 {
  public static void main(String[] args) {
    Cup<day10.chap9.Beer> c = new Cup();

    c.setBeverage(new day10.chap9.Beer());
    day10.chap9.Beer beverage = c.getBeverage();
    if(beverage instanceof day10.chap9.Beer){
      day10.chap9.Beer b = (day10.chap9.Beer)beverage;
    }

    Cup<day10.chap9.Boricha> b = new Cup();

    b.setBeverage(new day10.chap9.Boricha());
    day10.chap9.Boricha beverage1 = b.getBeverage();
//    beverage1.drink();
//    c.setBeverage(new Boricha());
//    c.getBeverage();
//    Object beverage1 = c.getBeverage();
//    if(beverage instanceof  Beer){
//      Boricha br = (Boricha) beverage1;
//    }

  }

}

class Beverage {
  void drink(){
    System.out.println("음료수를 마신다.");
  }
}

class Beer extends day10.chap9.Beverage {
  void drink(){
    System.out.println("맥주를 마신다.");
  }
}

class Boricha extends day10.chap9.Beverage {
  void drink(){
    System.out.println("보리차를 마신다.");
  }
}

class Cup<T> {
  private T beverage;

  public T getBeverage(){
    return beverage;
  }

  public void setBeverage(T beverage){
    this.beverage = beverage;
  }
}