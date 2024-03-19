package day11.chap9;

public class GenericMethodDemo1 {
  static class Utils {
//    public static void showArray(int[] a) {
//      for (int i : a) {
//        System.out.print(i+" ");
//      }
//      System.out.println(" ");
//    }
//
//    public static void showArray(String[] a) {
//      for (String s : a) {
//        System.out.print(s+ " ");
//      }
//      System.out.println(" ");
//
//    }
//
//    public static void showArray(Character[] a){
//      for (Character c : a) {
//        System.out.println(c+" ");
//      }
//      System.out.println(" ");
//    }
    public static <T> void showArray(T[] a){
      for (T t : a) {
        System.out.print(t+" ");
      }
      System.out.println();
    }

    public static <T> T getLast(T[] a) {
      return a[a.length-1];
    }

//    public static <T extends Number> void showArray(T[] a){ --> 이러면 string, character 은 사용이 안됨.
//
//    }

    public static void main(String[] args) {
      Integer[] ia = {1,2,3,4,5};
      Character[] ca = {'a', 'b', 'c', 'd', 'e'};
      String[] sa = {"hello", "kim won", "speaking"};

      Utils.showArray(ia);
      Utils.showArray(ca);
      Utils.showArray(sa);
      System.out.println(Utils.getLast(ia));
      System.out.println(Utils.getLast(ca));
      System.out.println(Utils.getLast(sa));
    }
  }
}
