package day12.chap11;

import java.util.*;

public class CollectionsDemo {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("cherry", "apple", "banana", "mango");
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);

    Collections.sort(list,(s,s1)->s1.compareTo(s));
    System.out.println(list);

    Collections.reverse(list);
    System.out.println(list);

    List<Character> cList = new ArrayList<>();
    for (char i = 'A'; i < 'G'; i++) {
      cList.add(i);
    }


    System.out.println(cList);
    Collections.rotate(cList, 3);
    System.out.println(cList);
    Collections.shuffle(cList);
    System.out.println(cList);
    Collections.shuffle(cList, new Random());
    Collections.sort(cList);

    System.out.println(Collections.binarySearch(cList, 'D')); // 바이너리 서치는 정렬된 배열에서만 사용할 수 있음



  }
}
