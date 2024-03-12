package day4.chap4;

public class Car {
  private String whatCar;
  String color;
  String direction;
  private static int lastNum = 0;
  private int serialNum;

  void getwhatCar() {
    System.out.printf("자동차는 %s입니다.\n",whatCar);
  }
  void setDirection(String direction) {
    this.direction = direction;
  }

  void  setColor(String color){
    this.color = color;
  }

  //methods
  void moving() {
    System.out.printf("일련번호 %d를 가진 %s의 %s 한대가 %s 방향으로 이동하고 있습니다.\n",serialNum, color, whatCar, direction);
  }

  //생성자
  Car(String car, String color) {
    this.whatCar = car;
    this.color = color;
    this.serialNum = lastNum++;
  }
}
