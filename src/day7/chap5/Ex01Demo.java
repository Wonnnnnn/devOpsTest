package day7.chap5;

public class Ex01Demo {
  public static void main(String[] args) {
    System.out.println(countChar("hello", 'L'));
    System.out.println(countChar("hello my name is won kim Lol", 'l'));
    System.out.println(countChar("long long time ago, there waa a big bear with lolly pop on his head", 'L'));
    System.out.println(countChar("long Long time ago, there waa a big bear with Lolly pop on his head", 'l'));
  }

  static int countChar (String s, char c) {
    int cnt = 0;
    char temp;

    s = s.toLowerCase();
    c = Character.toLowerCase(c);

    for (int i = 0; i < s.length(); i++) {
      temp = s.charAt(i);
      if (temp == c) {
        cnt++;
      }
    }

    return cnt;
  }
}
