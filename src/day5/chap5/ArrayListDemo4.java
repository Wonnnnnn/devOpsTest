package day5.chap5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> arrayList = new ArrayList<>();
    int score, sum = 0;
    double average;

    while(true) {
      System.out.print("점수를 입력하시오 : ");
      score = in.nextInt();
      if (score < 0) {
        break;
      }
      arrayList.add(score);
    }

    for (Integer i : arrayList) {
      sum += i;
    }
    average = (double)sum / arrayList.size();

    System.out.printf("입력된 점수는 총 %d개, 평균은 %.2f입니다.",arrayList.size(), average);
  }
}
