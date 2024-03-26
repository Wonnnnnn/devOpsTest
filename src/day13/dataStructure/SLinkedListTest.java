package day13.dataStructure;

import java.util.LinkedList;

public class SLinkedListTest {
  public static void main(String[] args) {
    SLinkedList<Integer> s1 = new SLinkedList<>();
    LinkedList<Integer> ll = new LinkedList<>();

    System.out.println(ll.size());
    System.out.println(s1.size());

    ll.add(10);
    ll.add(20);
    System.out.println(ll.size());
//    s1.remove();
    s1.addFirst(40);
    s1.addFirst(30);
    s1.addFirst(20);
    s1.addFirst(10);
    System.out.println(s1.size());

    for (int i = 0; i < s1.size(); i++) {
      System.out.println(s1.get(i));
    }
    System.out.println(s1.remove()+"가 삭제됨");

  }
}
