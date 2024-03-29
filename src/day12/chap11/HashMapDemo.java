package day12.chap11;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
  public static void main(String[] args) {
    Map<Fruit, Integer> map = new HashMap<>();

    map.put(new Fruit("apple"),4);
    System.out.println(map);
    map.put(null,4);
    System.out.println(map);
    map.put(new Fruit("banana"),10);
    System.out.println(map);
    map.put(new Fruit("apple"),20);
    System.out.println(map);

    Set<Fruit> fruits = map.keySet();
    System.out.println(fruits);
    Collection<Integer> values = map.values();
    System.out.println(values);
  }
}

class Fruit {
  String name;
  public Fruit(String name){
    this. name = name;
  }

  @Override
  public String toString() {
    return "Fruit{"+name+"}";
  }

  @Override
  public int hashCode() {
    return name != null?name.hashCode():0;
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Fruit f) {
      return this.name.equals(f.name);
    }
    return false;
  }
}