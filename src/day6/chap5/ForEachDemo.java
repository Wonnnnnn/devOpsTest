package day6.chap5;

public class ForEachDemo {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};
    int evensum = 0, oddsum = 0;

    for (int i : arr) {
      if (i%2 == 0) {
        evensum += i;
      }
    }

    for (int i : arr) {
      if (i%2 ==1) {
        oddsum += i;
      }
    }

    System.out.printf("홀수 : %d, 짝수 :%d", oddsum, evensum);
  }
}
