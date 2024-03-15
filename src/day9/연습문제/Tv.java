package day9.연습문제;

public class Tv extends Controller{

  public Tv(boolean power) {
    super(power);
  }

  @Override
  String getName() {
    return "TV";
  }

}
