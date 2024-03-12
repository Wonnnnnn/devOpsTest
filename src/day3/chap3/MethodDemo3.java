/*
package day3.chap3;

import java.util.Scanner;

public class MethodDemo3 {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("점수를 입력하세요 : ");
    int score = in.nextInt();

    if (checkScore(score)) {
      System.out.printf("%s등급 입니다.\n",checkGrade(score));
    }
    else {
      System.out.println("잘못된 점수입니다.");
    }
  }

  private static String checkGrade(int score) {
    String grade;
    if (score >= 90)
      grade = "A";
    else if (score >= 80)
      grade = "B";
    else if (score >= 70)
      grade = "C";
    else if (score >= 60)
      grade = "D";
    else
      grade = "F";
    return grade;
  }
  private static boolean checkScore(int score) {
    return score >= 0 && score <= 100;
  }
}*/
package day3.chap3;

import java.util.Scanner;

public class MethodDemo3 {
  public static void main(String[] args) {

    int score = getScore();
    printGrade(score);
  }

  private static void printGrade(int score) {
    if (checkScore(score)) {
      System.out.printf("입력받은 점수 %d의 학점은 %s입니다.\n", score, checkGrade(score));
    }
    else {
      System.out.println("유료하지 않은 범위의 점수가 입력되어 프로그램을 종료합니다.");
    }
  }

  private static int getScore() {
    Scanner in = new Scanner(System.in);
    System.out.print("점수를 입력하세요 : ");
    return in.nextInt();
  }

  private static String checkGrade(int score) {
    String grade;
    if (score >= 90)
      grade = "A";
    else if (score >= 80)
      grade = "B";
    else if (score >= 70)
      grade = "C";
    else if (score >= 60)
      grade = "D";
    else
      grade = "F";
    return grade;
  }

  private static boolean checkScore(int score) {
    return score >= 0 && score <= 100;
  }
}