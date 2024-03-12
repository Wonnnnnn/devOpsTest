package day4.exercise;

public class Account {
  private String name;
  private long balance;
  private String accountNo; //숫자 다섯자리
  private String pw; // 숫자 네자리

  void deposit(long amount) {
    balance += amount;
  }

  void withdraw(long amount) {
    if(amount>balance) {
      System.out.println("출금오류");
    }
    else {
      balance -= amount;
    }
  }

  void search() {
    System.out.printf("현재 계좌의 잔액은 %d입니다..\n", balance);
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
