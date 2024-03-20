package day11.chap10;

public class LambdaDemo {
  public static void main(String[] args) {
//    Object onj = new Object() {
//      int max(int a, int b) {
//        return a>b?a:b;
//      }
//    };

    MyFunction f = new MyFunction() {

      @Override
      public int min(int a, int b) {
        return a<b?a:b;
      }
    };


    MyFunction f1 = (a,b) -> a<b?a:b;
    System.out.println(f1.min(4, 5));

    System.out.println(f.min(10,5));

    NameClass n = new NameClass();
    System.out.println(n.min(10,5));
    System.out.println(n.min(3,7));
  }
}

class NameClass {
  int min(int a, int b) {
    return a < b ? a : b;
  }
}

interface MyFunction {
  public abstract int min(int a, int b);
}

class anonymous implements MyFunction {
  @Override
  public int min(int a, int b) {
    return 0;
  }
}
