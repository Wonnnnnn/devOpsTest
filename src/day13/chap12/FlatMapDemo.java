package day13.chap12;

import java.util.stream.Stream;

public class FlatMapDemo {
  public static void main(String[] args) {
    Stream<Nation> n1 = Nation.nations.stream();
    Util.printLn("나라이름 4개 출력하기");
    n1.map(nation->nation.getName())
        .limit(4)
        .forEach(Util::printWithParenthesis);

    Stream<Nation> n2 = Nation.nations.stream();
    Util.printLn("\n\n모든 나라의 GDP RANK 출력하기");
    n2.map(nation -> nation.getGdpRank())
        .forEach(Util::print);
  }
}
