package day1;

public class NumberTypeDemo {
  public static void main(String[] args) {

    byte b1 = 10;
    byte b2 = 0;

    short s1 = 600;
    short s2 = 0;

    int i1 = 200_000_000;
    int i2 = 0;

    long l1 = 1_000_000_000_000L;
    long l2 = 0L;

    System.out.println(b1+b2);
    System.out.println(s1+s2);
    System.out.println(i1+i2);
    System.out.println(l1+l2);

    char c1 = 'a';
    System.out.println(c1);
    c1 = 65;
    System.out.println(c1);
    c1 += 1;
    System.out.println(c1);

    float f1 = 0.0f;
    System.out.println(f1);

    double d1 = 0.0;
    System.out.println(d1);

    boolean bool = true; //안넣으면 default로 false로 배정
    System.out.println(bool);

  }
}
