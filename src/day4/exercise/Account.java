package day4.exercise;

public class Account {
  final private String name;
  private long balance;
  final private String accountNo; //숫자 다섯자리
  final private String pw; // 숫자 네자리

  public void deposit(long amount) {
    balance += amount;
  }

  public void withdraw(long amount) {
    if(amount>balance) {
      System.out.println("출금오류");
    }
    else {
      balance -= amount;
    }
  }

  public void search() {
    System.out.printf("현재 계좌의 잔액은 %d입니다.\n\n", balance);
  }

  public String getName() {
    return name;
  }

  public long getBalance() {
    return balance;
  }

  public String getAccountNo() {
    return accountNo;
  }

  public String getPw() {
    return pw;
  }

  public Account(String name, long balance, String accountNo, String pw) {
    this.name = name;
    this.balance = balance;
    this.accountNo = accountNo;
    this.pw = pw;
  }

}
/*
private String accnum;
private String pw;
private int balance;
private String name;
int money;

boolean check(String accnum, String pw) {

}
void withdraw(int money) {
  if(money>balance) {
    System.out.println("출금오류");
  }
  else {
    balance -= money;
  }
}

void deposit(int money) {
  //계좌번호를 입력하세요 pw
}

void Balance(){

}

*/
