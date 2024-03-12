package day5.chap4;

public class Singleton {
  //static member(field, methods)
  private static Singleton singleton = new Singleton();

  //생성자
  private Singleton() {

  }


  public static Singleton getSingleton() {
    return singleton;
  }
}
