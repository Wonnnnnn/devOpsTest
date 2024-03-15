package day9.chap7;

public class LocalClassDemo {
  public static void main(String[] args) {
    class Eagle implements Bird {
      @Override
      public void move() {
        System.out.println("독수리가 난다.");
      }
    }

    Bird e = new Eagle();
    e.move();

    Bird e1 = new Bird() {
      @Override
      public void move() {
        System.out.println("독수리가 난다.");
      }
    };
    e.move();

    /*new Bird() {
      @Override
      public void move() {
        System.out.println("독수리가 난다.");
      }
    }.move(); // 한번만 쓸거면 이거도 됨*/
  }
}
