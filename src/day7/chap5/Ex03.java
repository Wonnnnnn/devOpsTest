package day7.chap5;

import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String url = "";

    do {
      System.out.print("URL을 입력하시오 : ");
      url = in.nextLine();
      containCom(url);
      containJava(url);
    } while(!(url.equalsIgnoreCase("bye")));

  }

  public static void containCom(String s) {
    if(s.endsWith("com")) {
      System.out.printf("%s은 \"com\"으로 끝납니다.\n",s);
    }
  }

  public static void containJava(String s) {
    if (s.contains("java")) {
      System.out.printf("%s은 \"java\"을 포함합니다.\n",s);
    }
  }
}
