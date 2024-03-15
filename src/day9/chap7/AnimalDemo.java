package day9.chap7;

public class AnimalDemo {
  public static void main(String[] args) {
    Dog d = new Dog();
    Owl o = new Owl();

    makeSound(d);
    makeSound(o);

  }

  static void makeSound(Animal a) {
    a.sound();
  }
}
