package day11.chap9;

import java.util.Random;

public class ExceptionHandlingDemo {
  public static void main(String[] args) {
    Random r = new Random();
    try {
      for (int i = 0; i < 10; i++) {
        int num = r.nextInt(10);
        int result = 10/num;
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("try catch terminated");
    }
    System.out.println("program terminated");


  }
}
