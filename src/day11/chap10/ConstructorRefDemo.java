package day11.chap10;

public class ConstructorRefDemo {
  public static void main(String[] args) {
    NewArray<Integer> i;
    i = x -> new Integer[x];

    i =

    Integer[] array = i.getArray(3);

  }
}

@FunctionalInterface
interface NewArray<T> {
  T[] getArray(int size);
}