package day9.chap7;

public class CoinDemo implements Coin{
  public static void main(String[] args) {
    System.out.println("DIME은 "+DIME+"센트 입니다.");
    System.out.println("PENNY는 "+PENNY+"센트 입니다.");
    System.out.println("QUARTER는 "+QUARTER+"센트 입니다.");
    System.out.println("NICKEL은 "+NICKEL+"센트 입니다.");

  }
}


//implement 안쓰는법 --> 보통 이 방법 쓰는듯

//public class CoinDemo{
//  public static void main(String[] args) {
//    System.out.println("DIME은 "+Coin.DIME+"센트 입니다.");
//  }
//}
