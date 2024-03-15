package day9.chap7;

public class Laptop extends Computer implements Portable{
  @Override
  public void inMyBag() {
    System.out.println("노트북은 내 가방안에 있다.");
  }

  @Override
  public void Turnon() {
    System.out.println("노트북을 컨다.");
  }

  @Override
  public void Turnoff() {
    System.out.println("노트북을 끈다.");
  }
}
