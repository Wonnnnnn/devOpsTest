package day17.libraryproject;

public class User {
  private int id;
  private int libId;
  private String username;
  private String phone;
  private String address;
  private int point;
  private String  psssword;

  public User(int id, int libId, String username, String phone, String address, int point, String psssword) {
    this.id = id;
    this.libId = libId;
    this.username = username;
    this.phone = phone;
    this.address = address;
    this.point = point;
    this.psssword = psssword;
  }

  public int getId() {
    return id;
  }

  public int getLibId() {
    return libId;
  }

  public String getUsername() {
    return username;
  }

  public String getPhone() {
    return phone;
  }

  public String getAddress() {
    return address;
  }

  public int getPoint() {
    return point;
  }

  public String getPsssword() {
    return psssword;
  }
}
