package day10.연습문제;

import java.util.Random;

public class Dice {
  int roll() {
    Random r = new Random();
    return r.nextInt(1,7);
  }
}
