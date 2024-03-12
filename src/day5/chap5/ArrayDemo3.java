package day5.chap5;

import java.util.Scanner;

public class ArrayDemo3 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] scores = new int[5];
    double sum = 0, average = 0;

    for (int i = 0; i < 5; i++) {
      System.out.printf("%d번째 과목 점수를 입력하세요: ",i+1);
      scores[i] = in.nextInt();
    }

    for (int score : scores) {
      sum += score;
    }
    average = sum / 5;
    System.out.printf("평균은 %.2f점 입니다.",average);
  }
}
