package day17.libraryproject;

import java.sql.SQLException;
import java.util.List;

public class LibraryDemo {
  public static void main(String[] args) throws SQLException {
    System.out.println("전체 책 목록 조회하기");
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

//    System.out.println("\n데이터 넣기");
//    Book book1 = new Book(5,2,"airpods","김원","abc",
//        "800","1234567890129","PURCHASE", "");
//    System.out.println(bookDAO.bookCreate(book1)+"번 책이 추가되었습니다!");


    System.out.println("\n전체 목록 조회하기");
    for (Book book : bookDAO.bookList()) {
      System.out.println(book);
    }








  }
}
