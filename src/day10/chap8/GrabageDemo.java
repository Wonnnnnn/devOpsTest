package day10.chap8;

public class GrabageDemo {
  public static void main(String[] args) {

    for (int i = 0; i < 3; i++) {
      new Garbage(i);
      System.gc();
    }

  }
}

class Garbage {
  public int no;

  public Garbage(int no){
    this.no = no;
    System.out.println("Garbage "+no+"이 생성됨");
  }

  @Override
  protected void finalize() throws Throwable {
    System.out.println("Garbage "+no+"이 제거됨");
  }
}
