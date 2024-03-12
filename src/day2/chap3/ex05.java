package day2.chap3;

public class ex05 {
  public static void main(String[] args) {
    for (int x = 1; x <11 ; x++) {
      for (int y = 1; y < 11; y++) {
        if (60.0 == 4 * x + 5 * y) {
          System.out.printf("(%d, %d)\n", x, y);
        }
      }
    }
  }
}
