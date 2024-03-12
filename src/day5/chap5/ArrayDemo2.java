package day5.chap5;

import java.util.Arrays;

public class ArrayDemo2 {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};

    for (int i : arr) {
      System.out.println(i);
    }

    System.out.println(arr);
    for (int i = 0; i < 5; i++) {
      System.out.println(arr[i]);
    }

    System.out.println(Arrays.toString(arr));

    char[] cArr = {'a','b','c'};
    System.out.println(cArr);
    System.out.println(cArr.length);
    System.out.println(cArr[0]+cArr[1]);

    System.out.println(cArr);

    //문자열을 원소로 가지는 배열을 생성 후 foreach로 하나씩 찌긱
    String[] strArr = {"a","b","c","d"};

    for (String c : strArr) {
      System.out.print(c);
    }

    for (int i = 0; i < 4; i++) {
      System.out.print(strArr[i]);
    }
    System.out.println(Arrays.toString(strArr));


    float[] fArr = {1.1f, 3.3f, 5.6f};

    for (float v : fArr) {
      System.out.printf("%f ",v);
    }

    System.out.println(Arrays.toString(fArr));

  }
}
