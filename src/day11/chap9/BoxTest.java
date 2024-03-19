package day11.chap9;

public class BoxTest {
  public static void main(String[] args) {
    Box<Integer> i = new Box<>();
    i.set(Integer.valueOf(100));
    System.out.println(i.get());
    Box<String> s = new Box<>();
    s.set("만능이네!");
    System.out.println(s.get());
  }
}

class Box<T>{
  private T value;
  void set(T i){
    this.value = i;
  }

  T get(){
    return this.value;
  }
}
