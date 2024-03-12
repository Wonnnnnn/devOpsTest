package day3.chap3;

import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    System.out.printf("덧셈을 한 결과는 %d입니다.\n",plus(getNum(),getNum()));
    System.out.printf("뺄셈을 한 결과는 %d입니다.\n",minuus(getNum(),getNum()));
    System.out.printf("곱셈을 한 결과는 %.2f입니다.\n",mult(getNum(),getNum()));
    System.out.printf("나눗셈을 한 결과는 %.2f입니다.\n",divide(getNum(),getNum()));
  }
  public static int getNum() {
    Scanner in = new Scanner(System.in);
    System.out.print("숫자를 입력하세요 : ");
    return in.nextInt();
  }
  public static long plus(int a, int b) {
    return a + b;
  }

  public static long minuus(int a, int b) {
    return a-b;
  }

  public static double mult(float a, float b) {
    return a*b;
  }

  //메소드 오버로딩은 public - 함수이름이 똑같고 시그니처(변수)가 달라야함. 반환값은 크게 상관이 없음
  public static double divide(double a, double b) {
    if (b !=0) {
      return a/b;
    }
    System.out.println("나눗셈을 할 수 없습니다.");
    return -1;
  }
  public static double divide(int a, int b) {
    if (b !=0) {
      return (double)a /b;
    }
    System.out.println("나눗셈을 할 수 없습니다.");
    return -1;
  }
  public static double divide(long a, long b) {
    if (b !=0) {
      return (double)a /b;
    }
    System.out.println("나눗셈을 할 수 없습니다.");
    return -1;
  }
}
