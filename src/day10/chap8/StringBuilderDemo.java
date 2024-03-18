package day10.chap8;

public class StringBuilderDemo {
  public static void main(String[] args) {
    String s = "hi";

    System.out.println(s.hashCode());
    s+="!";
    System.out.println(s.hashCode());

    StringBuilder sb = new StringBuilder("hi");

    System.out.println(sb);
    System.out.println(sb.hashCode());
    System.out.println(sb.capacity());
    sb.append("!");
    System.out.println(sb);
    System.out.println(sb.hashCode());
    System.out.println(sb.capacity());
    sb.append("123456789012345678901234");
    System.out.println(sb.capacity());
    System.out.println(sb.replace(0,1,"hello")); // 자기 자신을 return하기 때문에 연속 호출이 가녕
  }
}
