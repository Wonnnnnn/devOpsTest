package day9.chap7;

public interface Movable {
  void move();
}

class Car implements Movable {

  private int position;

  @Override
  public void move() {
    position += 5;
  }

  public void show(){

    System.out.println(position+"m 이동한 나는 자동차입니다.");
  }
}
