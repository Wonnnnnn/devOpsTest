package day6.chap5;

public class ArgumentDemo {
  public static void main(String[] args) {
    if (args.length == 2) {
      nprint(args);
    }
    else {
      System.out.println("매개변수의 숫자가 다릅니다.");
    }
  }

  private static void nprint(String[] args) {
    for (int i = 0; i < Integer.parseInt(args[1]); i++) {
      System.out.println(args[0]);
    }
  }
}
