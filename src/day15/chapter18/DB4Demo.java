package day15.chapter18;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB4Demo {
  public static void main(String[] args) throws SQLException {
    Connection conn = DBConnectionDemo.makeConnection();
    PreparedStatement ps = conn.prepareStatement("UPDATE mytable set age = ? where id =?;");
    ps.setInt(1, 30);
    ps.setInt(2, 2);
    if (ps.executeUpdate() == 1) {
      System.out.println("good");
    } else {
      System.out.println("failed");
    }

  }
}
