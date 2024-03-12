package day3.chap3;

import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    accountManagement();
  }

  public static void accountManagement() {
    Scanner in = new Scanner(System.in);
    int choice, money, totalMoney = 0;

    do {
      System.out.println("-----------------------------------");
      System.out.println(" 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
      System.out.println("-----------------------------------");
      System.out.print("선택>");
      choice = in.nextInt();

      /* if문
      if(choice == 1) {
        System.out.print("예금액>");
        money = in.nextInt();
        totalMoney += money;
      }
      else if (choice == 2) {
        System.out.print("출금액>");
        money = in.nextInt();
        totalMoney -= money;
      }
      else if (choice == 3) {
        System.out.print("잔고>");
        System.out.println(totalMoney);
      }*/

      switch (choice) {
        case 1:
          System.out.print("예금액>");
          money = in.nextInt();
          totalMoney += money;
          break;
        case 2:
          System.out.print("출금액>");
          money = in.nextInt();
          if (totalMoney - money >= 0) {
            totalMoney -= money;
          }
          else {
            System.out.println("잔액이 부족합니다!");
          }
          break;
        case 3:
          System.out.print("잔고>");
          System.out.println(totalMoney);
          break;
      }
      System.out.println();

    } while(choice != 4);
    System.out.print("프로그램 종료");
  }
}
