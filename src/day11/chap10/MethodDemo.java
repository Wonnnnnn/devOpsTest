package day11.chap10;

public class MethodDemo {
  public static void main(String[] args) {
    Mathematical m;
//    m = d -> Math.abs(d);
    m = Math::abs;
    System.out.println(m.calculate(-50.2));
  }
}

@FunctionalInterface
interface Mathematical {
  double calculate(double d);
}
