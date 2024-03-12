package day2.chap3;

public class Ex1 {
  /*public static void main(String[] args) {
    int sum = 0;
    for(int i = 1; i<= 100; i++) {
      if (i%2 ==0) {
        sum += i;
      }
    }
    System.out.println(sum);
  }*/
  /*public static void main(String[] args) {
    int sum = 0;
    for(int i = 2; i<= 100 ; i+=2) {
      sum +=i;
    }
    System.out.println(sum);
  }*/
  public static void main(String[] args) {
    int sum = 0, i = 0;
    while(i<=100){
      sum += i;
      i+=2;
    }
    System.out.println(sum);

  }
}

