package day13.chap12;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedDemo {
  public static void main(String[] args) {
/*    System.out.println("국가 GDP 순서");
    Stream<Nation> n1 = Nation.nations.stream();
    n1.sorted(Comparator.comparing(Nation::getGdpRank))
        .map(Nation::getName)
        .limit(5)
        .forEach(Util::printWithParenthesis);
  //forEach(nation -> Util.printWithParenthesis(nation.getName()));*/

    System.out.println("국가 GDP 순서");
    Stream<Nation> n1 = Nation.nations.stream();
    n1.sorted(Comparator.comparing(Nation::getGdpRank))
        .map(nation -> nation.getName() + ", "+nation.getGdpRank())
        //.limit(5)
        .forEach(Util::printWithParenthesis);
    //forEach(nation -> Util.printWithParenthesis(nation.getName()));

    //인구가 많은 나라 순으로 나라 이름과 인구를 출력하기
    System.out.println("\n\n인구가 많은 나라 순으로 나라 이름과 인구를 출력하기");
    Stream<Nation> s1 = Nation.nations.stream();
    s1.sorted(Comparator.comparing(Nation::getPopulation).reversed())
        .map(nation -> nation.getName()+", "+nation.getPopulation())
        .forEach(Util::printWithParenthesis);


  }



}
