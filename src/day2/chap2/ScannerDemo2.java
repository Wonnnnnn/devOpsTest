package day2.chap2;

import java.util.Scanner;

public class ScannerDemo2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("두 숫자(정수)를 입력하시오 : ");

    int i = in.nextInt();
    int j = in.nextInt();

    System.out.printf("각 숫자는 %d과 %d이고, 두 숫자를 더하면 %d입니다.", i, j, i+j);

  }
}