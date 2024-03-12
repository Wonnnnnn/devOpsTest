package day1;

public class NumberTypeDemo2 {
  public static void main(String[] args) {
    final float PI = 3.141592f;
    double radius = 10.0;
    double area;
    area = PI * radius * radius;
    System.out.println("반지름 " + radius + "를 가지는 원의 넓이는 " + area + "입니다.");

    char c = '\u0041';
    System.out.println(c);

    byte b;
    int i = 128;
    b = (byte)i;
    System.out.println(b);
  }
}
