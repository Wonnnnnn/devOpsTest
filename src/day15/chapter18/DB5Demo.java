package day15.chapter18;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DB5Demo {
  public static void main(String[] args) throws SQLException {
    Connection conn = DBConnectionDemo.makeConnection();
    String sql = "Delete from mytable where id = ?";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setInt(1, 3);
    if(ps.executeUpdate() == 1) {
      System.out.println("delete completed");
    } else {
      System.out.println("failed.");
    }
  }
}
