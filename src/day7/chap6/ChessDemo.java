package day7.chap6;

public class ChessDemo {
  public static void main(String[] args) {
    WorldChess worldChess = new WorldChess();

  }
}

class Chess {
  final ChessPlayer getFirstPlayer() { // 흰거 먼저 시작이라 final
    return ChessPlayer.WHITE;
  }
}

enum ChessPlayer {
  WHITE, BLACK;
}

class WorldChess extends Chess {

}
