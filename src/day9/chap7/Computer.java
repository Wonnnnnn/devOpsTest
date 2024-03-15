package day9.chap7;

public class Computer implements Controllable{
  @Override
  public void Turnon() {
    System.out.println("컴퓨터를 켠다.");
  }

  @Override
  public void Turnoff() {
    System.out.println("컴퓨터를 끈다.");
  }
}
