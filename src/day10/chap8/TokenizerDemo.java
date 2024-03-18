package day10.chap8;

import java.util.StringTokenizer;

public class TokenizerDemo {
  public static void main(String[] args) {
    String s = "of the people, by the people, for the people";

    StringTokenizer st = new StringTokenizer(s," ,");
    System.out.println(st.countTokens());
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken()); //한번 끝까지 가면 돌아올 수 없음. 그래서 새로 배정을 해야함. StringTokenizer 선언 해서
    }
  }
}
