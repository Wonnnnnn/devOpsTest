package day7.chap6;

class Box { // 힙 영역에 박스, 컬러드 박스 만들어짐
  public Box(String s) {
    this(); // 기본생성자 부르기! 근데 위에는 아무것도 쓰면 안됨. 밑에는 가능 super도 마찬가지임
  }

  public Box() {

  }
}

class ColoredBox extends Box {
  public ColoredBox() {
    super();
  }
  public ColoredBox(String s) {
    super();
  }
}

public class BoxDemo {
  public static void main(String[] args) {
    ColoredBox box = new ColoredBox();
    ColoredBox box1 = new ColoredBox("box");
  }

}
