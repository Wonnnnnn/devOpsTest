package day17.libraryproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class BookDAO {
  private Connection conn;
  public List<Book> bookList() throws SQLException {
    conn = LibraryDBConnection.getConnection();
    String sql = "select id, lib_id,bookname, writer, publisher from books;";
    PreparedStatement ps = conn.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    List<Book> bookList = new LinkedList<>();
    Book book;
    if (rs != null) {
      while(rs.next()){
        book = new Book(rs.getInt(1), rs.getInt(2), rs.getString(3),
            rs.getString(4), rs.getString(5),"","","","");
        bookList.add(book);
      }
    }

    return bookList;
  }

  public List<Book> bookListByName(String name) throws SQLException{
    conn = LibraryDBConnection.getConnection();
    String sql = "select id, lib_id,bookname, writer, publisher from books where bookname like ?;";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, name);
    ResultSet rs = ps.executeQuery();
    List<Book> bookList = new LinkedList<>();
    Book book;
    if (rs != null) {
      while(rs.next()){
        book = new Book(rs.getInt(1), rs.getInt(2), rs.getString(3),
            rs.getString(4), rs.getString(5),"","","","");
        bookList.add(book);
      }
    }

    return bookList;
  }

  public List<Book> bookListByWriter(String writer) throws SQLException{
    conn = LibraryDBConnection.getConnection();
    String sql = "select id, lib_id,bookname, writer, publisher from books where writer like ?;";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, writer);
    ResultSet rs = ps.executeQuery();
    List<Book> bookList = new LinkedList<>();
    Book book;
    if (rs != null) {
      while(rs.next()){
        book = new Book(rs.getInt(1), rs.getInt(2), rs.getString(3),
            rs.getString(4), rs.getString(5),"","","","");
        bookList.add(book);
      }
    }

    return bookList;
  }

public List<Book> bookListByPublisher(String publisher) throws SQLException{
    conn = LibraryDBConnection.getConnection();
    String sql = "select id, lib_id,bookname, writer, publisher from books where publisher like ?;";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, publisher);
    ResultSet rs = ps.executeQuery();
    List<Book> bookList = new LinkedList<>();
    Book book;
    if (rs != null) {
      while(rs.next()){
        book = new Book(rs.getInt(1), rs.getInt(2), rs.getString(3),
            rs.getString(4), rs.getString(5),"","","","");
        bookList.add(book);
      }
    }

    return bookList;
  }

  public int bookCreate(Book book) throws SQLException{
    conn = LibraryDBConnection.getConnection();
    String sql = "insert into books(lib_id, bookname, writer, publisher, bookclass, isbn, kubun, status) values (?,?,?,?,?,?,?,?)";
    PreparedStatement ps = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
    ps.setInt(1, book.getLibId());
    ps.setString(2, book.getBookname());
    ps.setString(3, book.getWritername());
    ps.setString(4, book.getPublisher());
    ps.setString(5, book.getBookClass());
    ps.setString(6, book.getIsbn());
    ps.setString(7, book.getKubun());
    ps.setString(8, book.getStatus());
    if(ps.executeUpdate() == 1){
      ResultSet rs = ps.getGeneratedKeys();
      rs.next();
      return rs.getInt(1);
    }
    return -1;
  }



}
