package day2.chap2;

import java.util.Scanner;

public class ScannerDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("입력하세요 : ");
    //int num  = in.nextInt();
    //float num = in.nextFloat();
    String s = in.nextLine();
    double result = 1;
    result += Double.parseDouble(s);
    System.out.printf("당신이 입력한 내용은 %s 입니다.\n", s);
    System.out.printf("당신이 입력한 수에 1을 더하면 %.2f입니다.", result);
  }
}
