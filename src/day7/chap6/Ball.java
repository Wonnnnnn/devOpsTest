package day7.chap6;

public class Ball extends Circle{
  String color;

  Ball(String color) {
    this.color = color;
  }
  //final은 상속은 되는데 override가 안되는것

  public void findColor() {
    System.out.println(color+"색 공입니다.");
  }

  public void findvolume() {
    System.out.println("부피는 4/3*반지름*반지름*반지름 입니다.");
  }

  @Override
  public void findArea() {
    System.out.println("넓이는 4*3.14*반지름*반지름 입니다.");
    super.findArea();

  }

  @Override
  protected void findRadius() {
    super.findRadius();
  }
}
