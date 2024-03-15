package day9.chap7;

public class Tv implements Controllable{
  @Override
  public void Turnon() {
    System.out.println("Tv를 켠다.");
  }

  @Override
  public void Turnoff() {
    System.out.println("Tv를 끈다.");
  }
}
