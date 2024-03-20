package day12.chap11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
  public static void main(String[] args) {
    Set<String> set = Set.of("grape", "watermelon", "apple", "banana");
    HashSet<String> hashSet = new HashSet<>(set);
    System.out.println(hashSet);

    hashSet.add("apple");
    System.out.println(hashSet);

    hashSet.add("blueberry");
    System.out.println(hashSet);

    TreeSet<String> treeSet =new TreeSet<>(set);
    System.out.println(treeSet);
    System.out.println(treeSet.first());
    System.out.println(treeSet.last());

    treeSet.add("blueberry");

    System.out.println(treeSet.lower("cherry"));
    System.out.println(treeSet.higher("cherry"));

  }
}
