package day11.chap9;

import java.util.StringTokenizer;

public class UnChecked1Demo {
  public static void main(String[] args) {
    String s = "Time is money";
    StringTokenizer st = new StringTokenizer(s, " ,");


    while(st.hasMoreTokens()){
      System.out.printf("%s ",st.nextToken());
    }
    System.out.printf("%s ",st.nextToken());


  }
}
