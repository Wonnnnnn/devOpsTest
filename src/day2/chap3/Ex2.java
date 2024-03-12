package day2.chap3;

import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num;
    do {
      System.out.print("숫자를 입력하시오 : ");
      num = in.nextInt();
    } while(num <= 10);
    System.out.println("종료");
  }
}
