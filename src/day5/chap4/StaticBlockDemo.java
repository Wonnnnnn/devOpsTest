package day5.chap4;

public class StaticBlockDemo {
  static int sumOneToTen;
  static {
    int sum = 0; //인스턴스 변수임
    for (int i = 0; i < 11; i++) {
      sum += i;
    }
    sumOneToTen = sum;
  }

  public static void main(String[] args) {
    System.out.println(sumOneToTen);
  }
}
