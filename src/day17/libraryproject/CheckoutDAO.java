package day17.libraryproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class CheckoutDAO {
  private Connection conn;
  public List<Checkout> checkoutList() throws SQLException {
    conn = LibraryDBConnection.getConnection();
    String sql = "select lib_id,book_id, user_id,checkout_date, tobereturn_date from checkout;";
    PreparedStatement ps = conn.prepareStatement(sql);
    ResultSet rs = ps.executeQuery();
    List<Checkout> checkoutList = new LinkedList<>();
    Checkout checkout;
    if (rs != null) {
      while(rs.next()){
        checkout = new Checkout(1,rs.getInt(1), rs.getInt(2),rs.getInt(3),
            rs.getDate(4), rs.getDate(5),false,null,null);
        checkoutList.add(checkout);
      }
    }

    return checkoutList();
  }
//  public Checkout checkoutInfo(Checkout checkout)
//  public List<Checkout> checkoutListByBookName(String bookname)
//  public Checkout checkoutInfo(Checkout checkout)
//  public List<Checkout> checkoutListByUserName(String username)
//  public List<Checkout> checkoutListByUserId(String userId)
//  public Checkout checkoutInfo(Checkout checkout)
//  boolean checkoutCheck(Book book, Checkout checkout)
//  void checkoutProcess(Checkout checkout)
//  boolean checkoutCheck(Book book, Checkout checkout)
//  void checkinProcess(User user, Checkout checkout)
//  boolean checkoutCheck(Book book, Checkout checkout)
//  void renewProcess(User user, Checkout checkout)
}
