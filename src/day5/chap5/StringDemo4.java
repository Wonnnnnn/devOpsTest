package day5.chap5;

public class StringDemo4 {
  public static void main(String[] args) {
    String s1 = "abc";

    System.out.println(String.format("%s %d","JDK",17));

      System.out.println(String.join(":","happy", "sad", "delighted", "depressed"));

    System.out.println(String.valueOf(10));
    System.out.println(String.valueOf(1.20));
    System.out.println(String.valueOf('c'));
  }
}
