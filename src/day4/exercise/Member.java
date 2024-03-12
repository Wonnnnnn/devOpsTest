package day4.exercise;

public class Member {
  //연습문제 13번
  //현실세계의 회원을 멤버 클래스로 모델링 하려고 한다.
  //회원의 데이터는 이름, 아이디, 패스워드, 나이가 있다.
  //이 데이터를 가지는 멤버 클래스를 선언해라.
  private String name;
  private String id;
  private String pw;
  int age;

  public Member(String name, String id) {
    this.name = name;
    this.id = id;
  }



  boolean login(String id, String pw) {
    if (id.equals("홍") && pw.equals("12345")) {
      return true;
      //System.out.println("login successful");
    }
      //System.out.println("failed to login");
      return false;
  }

  boolean logout(String id) {
    if(id.equals("홍")) {
//      System.out.println("logout successful");
      return true;
    }
      //System.out.println("failed to logout");
      return false;
  }
}
