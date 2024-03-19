package day11.chap9;

public class GenericMethodDemo2 {


  public static void main(String[] args) {
    Ticket[] tickets = {
        new Ticket(5),
        new Ticket(3),
        new Ticket(10),
        new Ticket(7),
        new Ticket(4)
    };

    System.out.println(countGT(tickets,tickets[4]));
  }

  static <T extends Comparable> int countGT(T[] a, T elem) {
    int cnt = 0;
    for (T t : a) {
      if (t.compareTo(elem) > 0) {
        cnt++;
      }
    }
    return cnt;
  }

}

class Ticket implements Comparable<Ticket>{
  private int no;

  public Ticket(int no){
    this.no = no;
  }

  @Override
  public int compareTo(Ticket o) {
    return no -o.no;
  }
}
