package day12.chap11;

import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    Stack<String> s1 = new Stack<>();

    System.out.println(s1.empty());

    s1.push("apple");
    s1.push("banana");
    s1.push("cherry");

    System.out.println(s1.search("banana"));

    while(!s1.empty()){
      System.out.println(s1.pop());
    }

    Stack<Integer> si = new Stack<>();

    si.add(10);
    si.add(20);
    si.add(1, 30); // 원래 구조를 망가뜨리는 일 그래서 add w잘 안씀
    si.add(40);


  }
}
