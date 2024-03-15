package day9.연습문제;

public class Triangle implements Comparable{
  int width;
  int height;

  @Override
  public int compareTo(Object o) {
    double area1, area2;
    if(o instanceof Triangle tri) {
      area1 = (double) width*height/2;
      area2 = (double) tri.width* tri.height/2;
      if(area1>area2) return 1;
      else if (area1 == area2) return 0;
      else return  -1;
    }
    return -999;
  }

  @Override
  public String toString() {
    return "삼각형 [width = "+width+", height = "+height+", 넓이 = "+(int)((double)width*height/2)+"]";
  }

  public Triangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

}
