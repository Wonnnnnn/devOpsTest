package day5.chap5;

public class StringDemo3 {
  public static void main(String[] args) {
    String s1 = "abc";
    String s2 = "def";
    String s3 = " ";
    String s4 = "";

    System.out.println(s1+s2);
    System.out.println(s1.concat(s2));

    System.out.println(s1.charAt(0));
    System.out.println(s1.indexOf("b"));

    System.out.println(s3.isEmpty());
    System.out.println(s3.isBlank());

    System.out.println(s4.isEmpty());
    System.out.println(s4.isBlank());

    System.out.println(s3.length());
    System.out.println(s4.length());

    System.out.println(s1.toUpperCase());
    System.out.println(s1);
    s1 = s1.toUpperCase();
    System.out.println(s1);

    String s5 = "hello java";
    System.out.println(s5.substring(6,8));
  }
}
