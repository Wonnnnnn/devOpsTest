package day13.chap12;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FinalDemo {
  public static void main(String[] args) {
    OptionalInt min = IntStream.of(5, 1, 2, 3).min();
    System.out.println(min.getAsInt());

    OptionalInt max = IntStream.of(5, 1, 2, 3).max();
    System.out.println(max.getAsInt());
    System.out.println(IntStream.of(5, 1, 2, 3).count());
    System.out.println(IntStream.of(5, 1, 2, 3).average().getAsDouble()); // op
  }
}
