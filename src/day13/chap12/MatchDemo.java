package day13.chap12;

import java.util.Optional;

public class MatchDemo {
  public static void main(String[] args) {
    if(Nation.nations.stream()//stream을 반환하는것만 중간연ㄱ산, 아니면 최종
        .allMatch(nation -> nation.getPopulation() > 100.0)) {
      System.out.println("모든 국가의 인구가 1억이 넘는다.");
    } else {
      System.out.println("모든 국가의 인구가 1억이 넘지 않는다.");
    }

    //섬인 나라중에서 나라의 이름만 출력하기
    Optional<Nation> any =Nation.nations.stream()
        .filter(Nation::isIsland)
        .findAny();

    System.out.println(any);
    any.ifPresentOrElse(n->Util.printLn(n.getName()), ()-> Util.printLn("없음"));

    //섬인 나라중에서 나라의 이름만 출력하기
    Optional<Nation> first = Nation.nations.stream().findFirst();
    System.out.println(first.get().getName());
//    first.ifPresentOrElse(n-> Util.printLn(n));

  }
}
