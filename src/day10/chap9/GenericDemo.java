package day10.chap9;

import java.util.ArrayList;

public class GenericDemo {
  public static void main(String[] args) {
    ArrayList<Integer> ai = new ArrayList<>();
    ai.add(19);
    Integer i =ai.get(0);
    System.out.println(i);

    ArrayList<String> as = new ArrayList<>();
    as.add("abc");
    System.out.println(as.get(0));
    String s = as.get(0)+"def";
    System.out.println(s);

    ArrayList ao = new ArrayList<>();
    ao.add("10");
    ao.add(1);
    ao.add(3.14);

    Object o = ao.get(0);

    if(ao.get(0) instanceof String) {
      String s1 = (String)ao.get(0);
      System.out.println(s1);
    }
  }
}
