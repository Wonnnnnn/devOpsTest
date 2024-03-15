package day9.연습문제;

public class TriangleDemo {
  public static void main(String[] args) {
    Triangle triangle1 = new Triangle(10, 10);
    Triangle triangle2 = new Triangle(5, 10);

    if(triangle1.compareTo(triangle2)==1) {
      System.out.println(triangle1.toString()+"이 더 큽니다.");
    } else if (triangle1.compareTo(triangle2)==0) {
      System.out.println(triangle1.toString()+"으로 넓이가 같습니다.");
    } else if (triangle1.compareTo(triangle2)==-1) {
      System.out.println(triangle2.toString()+"가 더 큽니다.");
    } else {
      System.out.println(triangle1.toString()+"\n"+triangle2.toString()+"\n"+"비교불가!");
    }
  }
}
