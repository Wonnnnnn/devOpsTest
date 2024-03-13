package day7.chap5;

public enum Week {
  MON("월"), TUE("화"), WEDS("수"), THUR("목"), FRI("금"), SAT("토"), SUN("일");

  private String s;
  Week(String s) {
    this.s = s;
  }

  public String toString() {
    return s;
  }

}
