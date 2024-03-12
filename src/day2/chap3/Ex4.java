package day2.chap3;

public class Ex4 {
  public static void main(String[] args) {
    int result = 0;
    int round1, round2;
    do {
      round1 = (int)(Math.random()*6+1);
      round2 = (int)(Math.random()*6+1);
      System.out.printf("(%d, %d)\n", round1, round2);
      result = round1 + round2;
    } while(result !=5);
  }
}
