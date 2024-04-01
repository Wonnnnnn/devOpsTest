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

  public void setId(int id) {
    this.id = id;
  }

  public void setLibId(int libId) {
    this.libId = libId;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setPoint(int point) {
    this.point = point;
  }

  public void setPsssword(String psssword) {
    this.psssword = psssword;
  }

  @Override
  public String toString() {
    return "User[" +
        "아이디=" + id +
        ", 도서관 번호=" + libId +
        ", 이름='" + username + '\'' +
        ']';
  }
}
