package day2.chap2;

public class DataTypeDemo {
  public static void main(String[] args) {
    //숫자를 문자로 변환
    char c1 = 3;
    char c2 = 3 + '0';
    System.out.println("숫자 3의 문자는 " + c1);
    System.out.println("숫자 3의 문자'0'을 더한 결과 (문자) " + c2);
    System.out.println("숫자 3의 문자'0'을 더한 결과 (숫자) " + (int) c2 + "\n");

    //문자를 숫자로 변환
    int i2 = '3';
    int i3 = '3' - '0';
    System.out.println("문자 3의 숫자는 " + i2);
    System.out.println("문자 3에서 문자 0을 뺀 결과는 (숫자) " + i3 + "\n");

    //숫자를 문자열로 변환
    String s1 = 3 + "";
    System.out.println("숫자 3을 문자열로 변환 " + s1 + "\n");

    //문자열을 숫자로 변환
    int number = Integer.parseInt(s1);
    System.out.println("문자열 3을 숫자로 변환 " + number + "\n");

    //문자열을 실수로 변환
    double d1 = Double.parseDouble("3.14");
    System.out.println("문자열 3.14를 숫자로 변환 "+d1 + "\n"); //숫자 변환됐는지 보려면 연산을 해보면 됨

    //문자를 문자열로 변환
    String s2 = '3' + "";
    System.out.println("문자 3을 문자열로 변환 " + s2 + "\n");

    //문자열을 문자로 변환
    char c4 = s2.charAt(0);
    System.out.println("문자열 3을 문자로 변환" + c4 + "\n");


  }
}
