package day10.chap9;

public class GenericClassDemo1 {
  public static void main(String[] args) {
    Cup c = new Cup();

    c.setBeverage(new Beer());
    Object beverage = c.getBeverage();
    if(beverage instanceof  Beer){
      Beer b = (Beer)beverage;
    }
    c.setBeverage(new Boricha());
    c.getBeverage();
    Object beverage1 = c.getBeverage();
    if(beverage instanceof  Beer){
      Boricha br = (Boricha) beverage1;
    }

  }

}




class Cup {
  private Object beverage;

  public Object getBeverage(){
    return beverage;
  }

  public void setBeverage(Object beverage){
    this.beverage = beverage;
  }
}