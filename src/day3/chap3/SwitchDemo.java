package day3.chap3;

import java.util.Scanner;

public class SwitchDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("점수를 입력하시오 (100, 90, 80, 70, 60만 입력 가능합니다) : ");
    int score = in.nextInt();
    String grade = ""; // java의 switch문은 범위를 할 수 없다. so, 90,80,70 등으로 떨어짐
    switch (score) {
      default:
        grade = "점수를 잘못입력하셨습니다.";
        break;
      case 100:
        grade = "A";
        break;
      case 90:
        grade = "B";
        break;
      case 80:
        grade = "C";
        break;
      case 70:
        grade = "D";
        break;
      case 60:
        grade = "F";
        break;
    }

    if (grade.length() == 1) {
      System.out.printf("당신의 학점은 %s입니다.", grade);
    }
    else {
      System.out.print(grade);
    }

  }
}
