package day9.chap7;

public class ControllableDemo2 {
  public static void main(String[] args) {
    Controllable[] controllables = {
        new Tv(),
        new Computer(),
        new Laptop()
    };

    for (Controllable c : controllables) {
      c.Turnon();
      c.Turnoff();
      c.repair();
      if(c instanceof Laptop l) {
        l.inMyBag();
      }
      Controllable.reset();
    }

  }
}
