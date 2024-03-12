package day5.chap5;

public class ArrayListDemo {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4};
    int[] newArr = new int[5];
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      newArr[i] = arr[i];
    }
    arr=newArr;
    arr[4] = 5;
    for (int i : arr) {
      sum+=i;
    }
    System.out.printf("sum %d ",sum);
    System.out.println(arr.length);

    int[] newArr1 = new int[4];
    for (int i = 0; i < 4; i++) {
      newArr1[i] = arr[i];
    }
    arr = newArr1;
    sum = 0;

    for (int i : arr) {
      sum += i;
    }
    System.out.printf("sum %d ",sum);
    System.out.println(arr.length);
  }
}
