package day9.연습문제;

public class TalkableTest {
  static void speak(Talkable talkable){
    talkable.talk();
  }

  public static void main(String[] args) {
    speak(new Korean());
    speak(new American());
  }
}
