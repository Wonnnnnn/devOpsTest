package day6.chap5;

import java.util.ArrayList;
import java.util.Scanner;

public class VarLengthDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> integerArrayList = new ArrayList<>();
    int num;

  }

  public static void sumNPrint(int... v) { // 가변 개수
    int sum = 0;
    for (int i : v) {
      sum += i;
    }
    System.out.printf("배열읠 총 합은 %d입니다.",sum);
  }
}
