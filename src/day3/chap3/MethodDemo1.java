package day3.chap3;

public class MethodDemo1 {
  public static void main(String[] args) {
    sumAndPrint(1,10);
    sumAndPrint(10,100);
    sumAndPrint(100,1000);
  }
  public static void sumAndPrint(int a, int b) {
    int sum = 0;
    for (int i = a; i <= b; i++) {
      sum += i;
    }
    System.out.printf("%d~%d까지의 합 : %d\n", a, b, sum);
  }
}
