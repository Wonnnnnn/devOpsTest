package day5.chap5;

public class StringDemo {
  public static void main(String[] args) {
    String s1 = "hi java!";
    String s2 = "hi java!";

    System.out.println(s1);
    System.out.println(s2);

    if(s1 == s2) {
      System.out.println("yes!");
    }
    if(s1.equals(s2)) {
      System.out.println("yes!");
    }
  }
}
