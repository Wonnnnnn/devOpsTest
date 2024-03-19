package day11.chap9;

public class ExceptionDemo {
  public static void main(String[] args) {
    ArithmeticException e = new ArithmeticException();
    System.out.println(e.getMessage());
    e.printStackTrace();

//    int i = 5 / 0;
    String s = "";
    System.out.println(s.length());

    Object o = new Object();
    Object o2 = new Object();
    System.out.println(o.equals(o2));

    String[] strings = {}; // 오브젝트든 배열이든 null으로 주변 안됨 왜냐하면 널포인트 익셉션
    System.out.println(strings.length);
  }

}
