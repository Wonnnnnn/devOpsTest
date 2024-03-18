package day10.chap8;

import java.util.Arrays;

public class SystemDemo {
  public static void main(String[] args) {
    int[] src = {1,2,3,4,5,6};
    int[] dest = {10,20,30,40,50,60,70};

    System.out.println(System.currentTimeMillis());
    System.out.println(System.nanoTime());
    System.out.println(Arrays.toString(dest));
    System.arraycopy(src,0,dest,0,3);
    System.out.println(Arrays.toString(dest));
    System.out.println(System.currentTimeMillis());
    System.out.println(System.nanoTime());

  }
}
