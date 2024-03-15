package day9.chap7;

public class AnonymousDemo1 {
  private class Eagle implements Bird {
    @Override
    public void move() {
      System.out.println("새가 날아간다.");
    }
  }

  Eagle e = new Eagle();

  public static void main(String[] args) {
    AnonymousDemo1 a =new AnonymousDemo1();

    a.e.move();

  }
}
