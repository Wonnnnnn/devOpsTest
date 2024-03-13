package day7.chap6;

public class ParentChildDemo {
  public static void main(String[] args) {
    Parent parent = new Parent();
    Child child = new Child();
    System.out.println(parent.field1);
    parent.method1();

    System.out.println(child.field1);
    System.out.println(child.filed2);
    child.method1();
    child.method2();

  }
}
