package day9.chap7;

public interface Animal {
  void sound();
}

class Dog implements Animal {
  @Override
  public void sound() {
    System.out.println("멍멍");
  }
}

class Owl implements Animal {
  @Override
  public void sound() {
    System.out.println("뻐꾹");
  }
}
