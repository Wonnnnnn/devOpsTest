package day13.dataStructure;

public class ArrListTest {
  public static void main(String[] args) {
    /*ArrayList<Integer> al = new ArrayList<>();
    al.add(10);
    al.add(20);

    System.out.println(al.get(1));
    System.out.println(al.remove(0)+"가 삭제됨");*/

    ArrList<Integer> al = new ArrList<>();
    al.add(10);
    al.add(20);
    al.add(30);
    al.add(40);
    al.add(50);
    al.add(60);
    al.add(70);
    al.add(80);
    al.add(90);

    for (int i = 0; i < 9; i++) {
      System.out.println(al.removeLast() + "이 삭제됨");
//      System.out.println(al.size());
    }



  }
}
