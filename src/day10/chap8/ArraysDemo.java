package day10.chap8;

import java.util.Arrays;

public class ArraysDemo {
  public static void main(String[] args) {
    char[] a1 = {'j','a','v','a'};
    char[] a2 = Arrays.copyOf(a1,3);

    System.out.println(a1);
    System.out.println(a2);

    String[] s1 = {"cake","apple","banana","bread"};
    System.out.println(s1);

    print(s1);

    System.out.println(Arrays.binarySearch(s1,"apple"));

    Arrays.fill(s1,2, 4,"etc");
    print(s1);

  }

  private static void print(String[] s1) {
    for (String s : s1) {
      System.out.print(s + " ");
    }
  }

}
