package day6.chap5;

public class ReferenceDemo {
  public static void main(String[] args) {
    int[] arr = {1};
    System.out.println("before : "+arr[0]);
    increment(arr);
    System.out.println("after : "+arr[0]);
  }

  public static void increment(int[] a) {
    System.out.println("before : "+a[0]);
    a[0]++;
    System.out.println("after : "+a[0]);
  }
}