package day12.chap11;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
  public static void main(String[] args) {
    LinkedList<Integer> ll = new LinkedList<>();

    ll.add(10);
    ll.add(20);

 /*   System.out.println(ll.remove(0));
    System.out.println(ll.size());
    System.out.println(ll.remove(0));
    System.out.println(ll.size());*/

    long start = System.nanoTime();
    for (int i = 0; i < 1000000; i++) {
      ll.add(i);
    }
    long end = System.nanoTime();
    long duration = end - start;
    System.out.println(duration);

    ArrayList<Integer> al = new ArrayList<>();

    start = System.nanoTime();
    for (int i = 0; i < 1000000; i++) {
      al.add(i);
    }
    end = System.nanoTime();

    duration = end - start;
    System.out.println(duration);

  }
}
