package day5.chap5;

public class ArrayDemo {
  public static void main(String[] args) {
//    int score1 = 100;
//    int score2 = 90;
//    int score3 = 60;
//    int score4 = 80;
//    int score5 = 70;
//    String grade = " ";
//
//    int[] Score = new int[5];
//    for (int i = 0; i < 5; i++) {
//      Score[i] = 100;
//      System.out.println(Score[i]);
//    }

//    int[] scores1[] = new int[] {100,90,80,70,50};
//    int[] scores2[] = {100,90,80,70,50};
//    int[] scores3[];
//    scores3 = new int[] {100,90,80,70,50};
//
//    for (int i = 0; i < 5; i++) {
//      System.out.printf("%d %d %\nd", scores1[i], scores2[i],scores3[i]);
//
//    }
    int[] scores = {100, 90, 80, 70, 60};
    int[] scores1 = new int[] {100, 90, 80, 70, 60};

    System.out.println("3번째 학생 점수 : " + scores[2]);
    scores[2] = 85;
    System.out.println("3번째 학생 점수 : " + scores[2]);

  }
}
