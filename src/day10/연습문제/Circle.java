package day10.연습문제;

public class Circle {
  int radius;

  @Override
  public boolean equals(Object obj) {
//    if(obj instanceof Circle c){
//      if(this.radius == c.radius) {
//        return true;
//      }
//    }
//    return false;
    return (obj instanceof Circle c ? this.radius == c.radius : false);
  }

  public Circle(int radius){
    this.radius = radius;
  }
}
