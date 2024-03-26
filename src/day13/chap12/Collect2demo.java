package day13.chap12;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collect2demo {
  public static void main(String[] args) {
    Stream<Nation> s1 = Nation.nations.stream();
    List<String> slist = s1.map(Nation::getName)
        .limit(3)
        .collect(Collectors.toList());

    System.out.println(slist);

    Stream<Nation> s2 = Nation.nations.stream();
    Set<Nation.Type> sSet = s2.map(Nation::getType)
        .collect(Collectors.toSet());
    System.out.println(sSet);

    Stream<Nation> s3 = Nation.nations.stream();
    Map<String, Double> sMap = s3.collect(Collectors.toMap(Nation::getName, Nation::getPopulation));
    System.out.println(sMap);
  }
}
