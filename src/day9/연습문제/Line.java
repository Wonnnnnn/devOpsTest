package day9.연습문제;

public class Line implements Comparable{
  int length;

  @Override
  public String toString() {
    return "Line[length = "+length+"]";
  }

  public Line(int length) {
    this.length = length;
  }

  @Override
  public int compareTo(Object o) {
    if (o instanceof Line l) {
      if (length > l.length) { //클때
        return 1;
      } else if (length == l.length) {
        return 0;
      } else {
        return -1;
      }
    } else {
      return -999;
    }
  }
}
