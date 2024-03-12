package day2.chap3;

public class ForDemo2 {
  public static void main(String[] args) {
    double number;
    for (int i = 0; i < 6; i++) {
      number = Math.random()*6+1;
      System.out.println((int)number);
    }
  }
}
