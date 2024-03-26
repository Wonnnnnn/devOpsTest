package day13.chap12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo2 {
  public static void main(String[] args) {
    List<String> list1 = List.of("안녕", "자바", "잘 가, C++!");
    Stream<String> s1 = list1.stream();
    s1.flatMap(s-> Arrays.stream(s.split(" ")))
        .forEach(Util::printWithParenthesis);

    System.out.println();
    List<String> list2 = List.of("good morning");
    List<String> list3 = List.of("hello world", "welcome, stream");

    Stream<List<String>> s2 = Stream.of(list1, list2, list3);

    s2.flatMap(list -> {
      if(list.size() >1)
        return list.stream();
      else
        return Stream.empty();
    }).forEach(Util::printWithParenthesis);
  }
}
