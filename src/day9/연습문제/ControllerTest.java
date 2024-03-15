package day9.연습문제;

public class ControllerTest {
  public static void main(String[] args) {
    Controller[] controllers = {
        new Tv(false),
        new Radio(true)
    };

    for (Controller controller : controllers) {
      controller.show();
    }
  }
}
