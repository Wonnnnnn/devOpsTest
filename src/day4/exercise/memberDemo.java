package day4.exercise;

import java.util.Scanner;

public class memberDemo {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("아이디를 입력하시오 : ");
    String id = in.nextLine();
    System.out.print("비밀번호를 입력하시오 : ");
    String pw = in.nextLine();

    Member member = new Member("홍길동", "홍");


    if (member.login(id, pw)) {
      System.out.println("login successful");
      if (member.logout(id)) {
        System.out.println("logout successful");
      }
      else {
        System.out.println("failed to logout");
      }
    }
    else {
      System.out.println("failed to login");
    }

  }

}
