package day11.chap9;

public class EntryDemo {
  public static void main(String[] args) {
    Entry<Integer, String> entry = new Entry<>(1,"홍길동");
    Entry<Integer, String> entry1 = new Entry<>(2, "손흥민");

    System.out.println(entry.getKey()+"번은 "+ entry.getValue()+"입니다.");
    System.out.println(entry1.getKey()+"번은 "+ entry1.getValue()+"입니다.");
    System.out.println(entry.getKey()*0);

    Entry entry4 = new Entry<>(1, "홍길동");
    Object key = entry4.getKey();
    if(key instanceof Integer) {
      int result = (Integer)key * 0;
      System.out.println(result);
    } else {

    }

  }
}
