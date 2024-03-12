package day4.exercise;

import java.util.Scanner;

public class AccountDemo {
  public static void main(String[] args) {
    accountManagement();

  }

  private static void accountManagement() {
    Account account = accountCreate();

    Scanner in = new Scanner(System.in);
    System.out.print("계좌번호를 입력하세요 : ");
    String accountNo = in.nextLine();
    System.out.print("비밀번호를 입력하세요 : ");
    String pw = in.nextLine();

    if(account.getAccountNo().equals(accountNo)) {
      if(account.getPw().equals(pw)) {
        System.out.println("---------------------------");
        System.out.println("1. 입금 2.출금 3.잔고확인 4.종료");
        System.out.println("---------------------------");
        System.out.print("선택>");
        int choice = in.nextInt();

        if(choice == 1) {
          System.out.print("입금>");
          long amount = in.nextLong();
          account.deposit(amount);
          account.search();
        } else if (choice == 2) {
          System.out.print("출금>");
          long amount = in.nextLong();
          account.withdraw(amount);
          account.search();
        } else if (choice == 3) {
          account.search();
        } else if (choice == 4) {
          System.out.println("프로그램 종료");
        } else {
          System.out.println("번호를 확인하시고 다시 입력해주세요!");
        }
      }
      else {
        System.out.println("계좌 비밀번호 오류");
      }
    }
    else {
      System.out.println("계좌번호 오류");
    }
  }

  private static Account accountCreate() {
    Account account = new Account("홍길동",0, "53429","1234");
    return account;
  }
}
