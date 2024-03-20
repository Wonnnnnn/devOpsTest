package day12.chap11;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {
    String[] animals = {"사슴", "호랑이", "바다표범", "곰"};
    List<String> animalList = Arrays.asList(animals);

    Iterator<String> iterator = animalList.iterator();

    while(iterator.hasNext()) {
      System.out.print(iterator.next()+" ");
    }
    System.out.println();
    animalList.set(0, "앵무새");


    iterator = animalList.iterator();
    while(iterator.hasNext()) {
      System.out.print(iterator.next()+" ");
    }

    System.out.println();

    animalList.sort((s1,s2)->s1.length()-s2.length());

    iterator = animalList.iterator();
    while(iterator.hasNext()) {
      System.out.print(iterator.next()+" ");
    }
    System.out.println();

    String[] array = animalList.toArray(new String[4]);

    for (String s : array) {
      System.out.print(s + " ");
    }
    System.out.println();

    List<String> aList = List.of("a", "b", "c", "d", "e");
    aList.forEach(s -> System.out.print(s+ " "));
    System.out.println();

    aList.forEach(System.out::print);

    /*Iterator<String> iterator1 = aList.iterator();
    while(iterator1.hasNext()) {
      System.out.print(iterator1.next()+" ");
    }
    System.out.println();*/

  }
}
