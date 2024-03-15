package day9.연습문제;

public class Radio extends Controller{

  public Radio(boolean power) {
    super(power);
  }

  @Override
  String getName() {
    return "Radio";
  }

}
