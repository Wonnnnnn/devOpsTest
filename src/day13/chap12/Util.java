package day13.chap12;

public class Util {
  public static <T> void print(T t){
    System.out.print(t + " ");
  }

  public static <T> void printLn(T t){
    System.out.println(t);
  }

  public static <T> void printWithParenthesis(T t){
    System.out.print("("+t+")");
  }
  public static <T> void printWithParenthesisLn(T t){
    System.out.println("("+t+")");
  }
}
