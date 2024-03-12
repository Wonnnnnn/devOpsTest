package day2.chap3;

import java.util.Scanner;

public class NestedIfDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("점수를 입력하시오");
    int number = in.nextInt();
    String grade = "";

    if (number >= 90)
      grade = "A";
    else if (number >= 80)
      grade = "B";
    else if (number >= 70)
      grade = "C";
    else if (number >= 60)
      grade = "D";
    else
      grade = "F";
    System.out.print(grade);
  }
}
