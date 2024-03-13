package day7.chap5;

import java.util.Arrays;

public class Ex04 {
  public static void main(String[] args) {
    String[] name = {"가위", "바위", "보"};
    System.out.println(name);
    System.out.println(Arrays.toString(name));

    for (int i = 0; i < 10; i++) {
      System.out.println(name[(int)(Math.random()*3)]);
    }
  }
}
