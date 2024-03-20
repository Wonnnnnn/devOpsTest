package day12.chap11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
  public static void main(String[] args) {
    List<String> car = List.of("그랜저", "소나타", "아반떼", "제네시스", "소울");
    List<String> list = new ArrayList<>(car);
    System.out.println(list.size());

    list.forEach(s -> System.out.print(s+" "));
    System.out.println();

    if(list.contains("아반떼")){
      list.remove(list.indexOf("아반떼"));
    }

    list.forEach(s -> System.out.print(s+" "));
    System.out.println();

    list.add("산타페");

    list.forEach(s -> System.out.print(s+" "));
    System.out.println();

    String removedItem = list.remove(3);
    System.out.println(removedItem);

    list.forEach(s -> System.out.print(s + " "));
    System.out.println();

    list.removeIf(s -> s.length() ==3);

    list.forEach(s -> System.out.print(s + " "));
    System.out.println();

    list.replaceAll(s -> "코나");
    list.forEach(s -> System.out.print(s + " "));
    System.out.println();

  }
}
