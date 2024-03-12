package day4.exercise;

public class Circle {
  //정적 멤버, static member = class member
  static int numberOfCircles; // 정적 멤버는 기본값을 0으로 가짐
  //인스턴스 멤버
  int radius; //초기 0
 static final double PI = 3.14;
  String color = ""; // null나와서 null포인트 exception을 피하기 위해서 빈 문자열 넣음
  //메서드 --> 정적 / 인스턴스

  //생성자
  public Circle (int radius, String color) {
    this.radius = radius;
    this.color = color;
    System.out.println(color + "색의 크기가 "+radius+"인 circle이 "+(++numberOfCircles)+"개 생성되었습니다.");
  }
}
