package day2.chap2;

public class OpDemo {
  public static void main(String[] args) {
    // 증감 연산자 ++ --
    int i = 1;
    System.out.println(i);
    i = i+1;
    System.out.println(i);
    i += 1;
    System.out.println(i);
    i++;
    System.out.println(i);
    i = i-1;
    System.out.println(i);
    i-=1;
    System.out.println(i);
    i--;
    System.out.println(i);

    // 산술연산자 + - * / %
    int j = 1%2;
    System.out.println("1은 홀수입니다.");
    int k = 2%2;
    System.out.println("2는 짝수입니다.");

    // 비교연산
    boolean b = j <= k;
    System.out.println(b);;

    //논리 연산
    boolean b1 = 1 > 0 && 2 > 1;
    System.out.println(b1);

    boolean b2 = 1 > 0 || 0 == 1;
    boolean b3 = 1 < 0 || 0 == 1;
    System.out.println(b2);
    System.out.println(b3);

    boolean b4 = (1 == 1) ? true : false;
    System.out.println(b4);

    int i1 = (1 == 1) ? 10 : 20;
    System.out.println(i1);

    String s = (1 != 1) ? "hello" : "world";
    System.out.println(s);

    boolean b5 = true;
    System.out.println(!b5);

  }
}
