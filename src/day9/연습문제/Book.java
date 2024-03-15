package day9.연습문제;

public class Book implements Comparable{
  int price;

  @Override
  public int compareTo(Object o) {
    if(o instanceof Book b) {
      return this.price - b.price;
    }
    return -999;
  }

  @Override
  public String toString() {
    return "Book [price = "+price+"]";
  }

  public Book(int price) {
    this.price = price;
  }
}
