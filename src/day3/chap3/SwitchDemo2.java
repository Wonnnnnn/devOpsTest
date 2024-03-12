package day3.chap3;

import java.util.Scanner;

public class SwitchDemo2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("동물을 입력해주세요 : ");
    String guess = in.nextLine();
    String answer = "";

    /* original
    switch (guess) {
      case "호랑이":
      case "사자":
        answer = "포유류";
        break;
      case "참새":
      case "비둘기":
        answer = "조류";
        break;
      case "고등어":
      case "참치":
        answer = "어류";
        break;
      default:
        System.out.print("어이쿠! ");
        answer = "...";
        break;
    }
    System.out.printf("%s는 %s입니다.",guess, answer);*/

    /* advanced 1
    switch (guess) {
      case "호랑이", "사자" -> answer = "포유류";
      case "참새", "비둘기" -> answer = "조류";
      case "고등어", "참치" -> answer = "어류";
      default -> answer = "...";
    }
    System.out.printf("%s는 %s입니다.",guess, answer);*/

    /* advanced 2
    String answer = switch (guess) {
      case "호랑이", "사자" -> "포유류";
      case "참새", "비둘기" -> "조류";
      case "고등어", "참치" -> "어류";
      default ->"...";
    };
    System.out.printf("%s는 %s입니다.",guess, answer);*/
    answer = switch (guess) {
      case "호랑이", "사자" -> "포유류";
      case "참새", "비둘기" -> "조류";
      case "고등어", "참치" -> "어류";
      default -> {
        System.out.print("어이쿠! ");
        yield "..."; // 제일 마지막 명령어임 return 이랑 똑같은 아이임.
      }
    };
    System.out.printf("%s는 %s입니다.",guess, answer);
  }
}
