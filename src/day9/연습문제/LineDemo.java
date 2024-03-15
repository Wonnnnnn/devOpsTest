package day9.연습문제;

public class LineDemo {
  public static void main(String[] args) {
    Line l1 = new Line(20);
    Line l2 = new Line(10);

    if (l1.compareTo(l2) == 1){
      System.out.println(l1.toString()+" 이 더 깁니다.");
    } else if (l1.compareTo(l2) == 0) {
      System.out.println(l1.toString()+" 으로 길이가 같습니다.");
    } else {
      System.out.println(l2.toString()+" 이 더 깁니다.");
    }


  }
}
