package day11.chap10;

public class LambdaDemo3 {
  public static void main(String[] args) {
    method1((a, b) -> a < b ? a : b);
    MyFunction f = method2();
    System.out.println(f.min(4,2));
  }

  static void method1(MyFunction f){
    System.out.println(f.min(3, 5));
  }

  static MyFunction method2() {
    return ((a, b) -> a < b ? a : b);
  }
}
