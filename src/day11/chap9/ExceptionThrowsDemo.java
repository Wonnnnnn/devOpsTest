package day11.chap9;

import java.util.Scanner;

public class ExceptionThrowsDemo {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.print("숫자를 입력해주세요 : ");
    String num = in.nextLine();
    System.out.print("숫자를 입력해주세요 : ");
    String num2 = in.nextLine();
    try {
      square(num);
      divide(num,num2);
    } catch (NumberFormatException e) {
      System.out.println(e.getMessage());
      System.out.println("정수가 아니거나 0으로 나눈 오류입니다.");//오류는 왠만하면 메인에서 처리를 해주어야한다.
    }
  }

  private static void square(String d) throws NumberFormatException{
    int i = Integer.parseInt(d);
    System.out.println("제곱값은 "+i*i);
  }

  private static void divide(String s, String s1) throws ArithmeticException, NumberFormatException {
    int i = Integer.parseInt(s);
    int i1 = Integer.parseInt(s1);

    System.out.println("나누면"+i/i1);
  }

}
