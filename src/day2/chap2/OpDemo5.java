package day2.chap2;

public class OpDemo5 {
  public static void main(String[] args) {
    int x = 1, y, z;
    //y = (x!=1)?10:x++;
    //System.out.println(y);
    x = y = z = 3;

    z = x++ + -- y * x; // 뒤에 x가 4로 변경 후 참조돼서 3 + 2 * 4 가 됨
    System.out.println(z);

    String s = (x>1)?"false":"helloworld";
    System.out.println(s);
  }
}
