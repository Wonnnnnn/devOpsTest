package day2.chap2;

public class OpDemo4 {
  public static void main(String[] args) {
    int i = 3;
    System.out.println("연산전 : " + i);
    //int j = ++i;
    int j = i++;
    System.out.println("연산 전 j : " + j);
    System.out.println("연산 후 i : "+i);
  }
}
