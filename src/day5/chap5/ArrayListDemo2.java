package day5.chap5;

import java.util.ArrayList;

public class ArrayListDemo2 {
  public static void main(String[] args) {
/*    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(10);
    System.out.println(arrayList.toArray().length);
    arrayList.add(20);
    System.out.println(arrayList.toArray().length);
    arrayList.add(30);
    System.out.println(arrayList.toArray().length);
    arrayList.add(40);
    System.out.println(arrayList.toArray().length);
    arrayList.add(50);
    System.out.println(arrayList.toArray().length);

    System.out.println(arrayList.remove(4));
    System.out.println(arrayList.toArray().length);*/
    ArrayList<Character> arrayList = new ArrayList<>();
    arrayList.add('a');
    arrayList.add('b');
    arrayList.add('c');
    arrayList.add('d');
    arrayList.add('e');

    for (char c : arrayList) {
      System.out.printf("%c ",c);
    }

    System.out.println(arrayList);
    System.out.println(arrayList.get(2));
    System.out.println(arrayList.size());
  }
}
