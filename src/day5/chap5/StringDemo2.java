package day5.chap5;

public class StringDemo2 {
  public static void main(String[] args) {
    String s1 = "hi java!";
    String s2 = "hi java!";
    String s3 = new String("hi java!");
    String s4 = new String("hi java!");

    System.out.println("s1 == s2 ? " + (s1 == s2));
    System.out.println("s1 == s3 ? " + (s1 == s3));
    System.out.println("s1 == s4 ? " + (s1 == s4));
    System.out.println("s2 == s4 ? " + (s2 == s4));

    s1 = s3;
    System.out.println("s1 == s2 ? " + (s1 == s2));
    System.out.println("s1 == s3 ? " + (s1 == s3));
    System.out.println("s1 == s4 ? " + (s1 == s4));
    System.out.println("s2 == s4 ? " + (s2 == s4));

    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));

    String s5 = "java";
    String s6 = "JAVA";

    System.out.println(s5.equals(s6));
    System.out.println(s5.equalsIgnoreCase(s6));
    System.out.println(s5.compareTo(s6)); // 앞 기준으로 뺌 s5 - s6
    System.out.println(s6.compareTo(s5));
    System.out.println(s5.compareToIgnoreCase(s6));

  }
}
