package day2.chap3;

import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("실수를 입력하시오 : ");
    double num = in.nextFloat();
    double res = 50000 / num;
    double res2 = 50000 % num;

    if (Double.isInfinite((res)) || Double.isInfinite(res2)) {
      System.out.println("무한대 값이거나 숫자가 아닙니다.");
    }
    else {
      System.out.println(res + 15000);
      System.out.println(res2 + 15000);
    }
  }
}
