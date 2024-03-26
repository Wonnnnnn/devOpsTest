package day13.chap12;

import java.util.stream.Stream;

public class MapDemo {
  public static void main(String[] args) {
    Stream<String> s1 = Stream.of("a1", "b1", "b2", "c1", "c2");
    s1.map(String::toUpperCase)
        .forEach(Util::print);

    System.out.println("\n");

    Stream<String> s2 = Stream.of("a1", "a2", "a3");
    s2.map(s -> s.substring(1))
        .map(Integer::parseInt)
        .map(i -> i * i)
        .forEach(Util::print);
  }
}
