package day9.chap7;

public interface RemoteControllable extends Controllable{
  default void remoteTurnOn() {
    System.out.println("리모콘으로 켠다");
  }

  default void remoteTurnOff() {
    System.out.println("리모콘으로 끈다.");
  }
}
