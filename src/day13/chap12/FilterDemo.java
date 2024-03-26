package day13.chap12;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterDemo {
  public static void main(String[] args) {
    Stream.of("a1", "b1", "b2", "c1", "c2", "c3")
        .filter(x -> {
          System.out.println(x);
          return x.startsWith("c");
        })
        .skip(1)
        .forEach(Util::printWithParenthesisLn);

    IntStream intStream = IntStream.of(1, 2, 2, 1, 3, 3, 4);
    intStream.filter(i -> i%2 ==0)
        .distinct()
        .forEach(Util::print);


    System.out.println("\n인구가 1억 이상의 2개 나라.");
    Nation.nations.stream()
        .filter(nation ->nation.getPopulation() > 100.0)
        .limit(2)
        .forEach(Util::printWithParenthesis);
  }
}
