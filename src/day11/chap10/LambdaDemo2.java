package day11.chap10;

import java.util.*;

public class LambdaDemo2 {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(9, 3, 7, 5);
    Collections.sort(list);// ascending
    System.out.println(list.toString());

    /*Collections.sort(list, new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2-o1;
      }
    });*/

    Collections.sort(list, (o1, o2) -> o2-o1);
    System.out.println(list.toString());

    List<String> list1 = Arrays.asList("abd", "bbb", "aaa", "ccc", "ddd");
    Collections.sort(list1, (o1, o2) -> o1.compareTo(o2));
    System.out.println(list1.toString());


  }
}
