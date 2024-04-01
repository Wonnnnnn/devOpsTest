package day17.libraryproject;

import java.sql.SQLException;
import java.util.List;

public class LibraryDemo {
  public static void main(String[] args) throws SQLException {
    /*System.out.println("전체 책 목록 조회하기");
    BookDAO bookDAO = new BookDAO();
    List<Book> books =  bookDAO.bookList();

    for (Book book : books) {
      System.out.println(book);
    }

    System.out.println("\n책 이름 조회하기");
    for (Book book : bookDAO.bookListByName("자바")) {
      System.out.println(book);
    }

    System.out.println("\n저자 조회하기");
    for (Book book : bookDAO.bookListByWriter("나자바")) {
      System.out.println(book);
    }

    System.out.println("\n출판사 조회하기");
    for (Book book : bookDAO.bookListByPublisher("KOSTA")) {
      System.out.println(book);
    }

//    System.out.println("\n중복 체크");
//    if(bookDAO.isbnDuplicateCheck("1234567890128")){
//      System.out.println("ISBN 중복입니다. 번호 확인 후 재입력하세요.");
//    }
//    else{
//      System.out.println("\n데이터 넣기");
//      Book book1 = new Book(5, 1, "mac", "sleepy", "abc",
//          "700", "1234567890134", "DONATION", "");
//      System.out.println(bookDAO.bookCreate(book1) + "번 책이 추가되었습니다!");
//    }



    System.out.println("\n전체 목록 조회하기");
    for (Book book : bookDAO.bookList()) {
      System.out.println(book);
    }*/

//    Scanner in = new Scanner(System.in);
//
//    System.out.println("전체 유저 목록 조회하기");
//    UserDAO userDAO = new UserDAO();
//    List<User> users = userDAO.userList();
//
//    for (User user : users) {
//      System.out.println(user);
//    }
//
//    System.out.println("\n유저 이름 조회하기");
//    for (User user : userDAO.userlistByName("user2")) {
//      System.out.println(user);
//    }
//
//    System.out.println("\n유저 ID 조회하기");
//    System.out.println(userDAO.userByID(1));

//
//    System.out.println("\n유저 정보 입력받기");
//    User user = userDAO.userInfo(in);
//    System.out.println("\n유저 신규 등록하기");
//    if (userDAO.userPhoneDuplicateCheck(user.getPhone())){
//      System.out.println(userDAO.userCreate(user)+"번 유저가 생성되었습니다.");
//    } else {
//      System.out.println("전화번호가 중복되므로 유저 생성에 실패하였습니다.");
//    }

//    System.out.println("\n유저 정보 삭제");
//    User user1= userDAO.setUser(in);
//    if (user1.getId() != 0){
//      if(userDAO.userCheck(user1)){
//        userDAO.userDelete(userDAO.setUser(in));
//      }
//      else {
//        System.out.println("대출중이므로 회원 탈퇴가 불가능합니다.");
//      }
//    } else {
//      System.out.println("입력 정보 오류입니다.");
//    }

    System.out.println("전체 대출 목록 조회하기");
    CheckoutDAO checkoutDAO = new CheckoutDAO();
    List<Checkout> checkouts = checkoutDAO.checkoutList();
    for (Checkout checkout : checkouts) {
      System.out.println(checkout);
    }











  }
}
