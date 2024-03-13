package day6.chap5;

import day4.exercise.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountDemo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<Account> accounts = new ArrayList<>();
    int menu;
    long amount;
    String Acc, Pw, name;
    Account temp;

    do {
      System.out.println("------------------------------------");
      System.out.println("1.계좌 생성 2.입금 3.출금 4.잔고확인 5.종료");
      System.out.println("------------------------------------");
      System.out.print("선택>");
      menu = in.nextInt();
      in.nextLine();

      switch (menu) {
        case 1:
          System.out.println("계좌를 생성합니다.");
          System.out.print("이름을 입력하시오 : ");
          name = in.nextLine();
          System.out.print("계좌번호를 입력하시오 : ");
          Acc = in.nextLine();
          System.out.print("비밀번호를 입력하시오 : ");
          Pw = in.nextLine();
          System.out.print("잔액을 입력하시오 : ");
          amount = in.nextLong();
          temp = new Account(name,amount,Acc,Pw);
          accounts.add(temp);
          break;
        case 2:
          System.out.print("계좌번호를 입력하시오 : ");
          Acc = in.nextLine();
          System.out.print("비밀번호를 입력하시오 : ");
          Pw = in.nextLine();
          for (Account account : accounts) {
            if(account.getAccountNo().equals(Acc)){
              if(account.getPw().equals(Pw)){
                System.out.print("로그인 성공!\n금액을 입력하시오 :");
                amount = in.nextInt();
                account.deposit(amount);
                break;
              }
            }
          }
          System.out.println("일치하는 정보가 없습니다.\n");
        case 3:
          System.out.print("계좌번호를 입력하시오 : ");
          Acc = in.nextLine();
          System.out.print("비밀번호를 입력하시오 : ");
          Pw = in.nextLine();
          for (Account account : accounts) {
            if(account.getAccountNo().equals(Acc)){
              if(account.getPw().equals(Pw)){
                System.out.print("로그인 성공!\n금액을 입력하시오 :");
                amount = in.nextInt();
                account.withdraw(amount);
                break;
              }
            }
          }
          System.out.println("일치하는 정보가 없습니다.\n");
        case 4:
          System.out.print("계좌번호를 입력하시오 : ");
          Acc = in.nextLine();
          System.out.print("비밀번호를 입력하시오 : ");
          Pw = in.nextLine();
          for (Account account : accounts) {
            if(account.getAccountNo().equals(Acc)){
              if(account.getPw().equals(Pw)){
                System.out.println("로그인 성공!");
                account.search();
                break;
              }
            }
          }
          System.out.println("일치하는 정보가 없습니다.");
        case 5:
          System.out.println("프로그램을 종료합니다.\n");
          break;
        default:
          System.out.println("메뉴 선택을 잘못하셨습니다. 다시입력해주세요.\n");
          break;
      }

    } while(menu !=5);
  }
}
