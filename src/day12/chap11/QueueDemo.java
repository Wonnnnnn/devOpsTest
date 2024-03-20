package day12.chap11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
  public static void main(String[] args) {
    Queue<String> q = new LinkedList<>();
    System.out.println(q.size());

    q.offer("apple");
    q.offer("banana");
    q.offer("cherry");

    System.out.println(q.size());

    while (!q.isEmpty()){
      System.out.println(q.poll());
    }

    boolean apple = q.add("apple");
    System.out.println(q.poll());
    System.out.println(q.poll());

  }
}
