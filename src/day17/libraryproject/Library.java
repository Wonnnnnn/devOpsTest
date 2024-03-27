package day17.libraryproject;

public class Library {

  private int id;
  private String name;
  private String address;
  private String phone;
  private String info;

  public Library(int id, String name, String address, String phone, String info) {
    this.id = id;
    this.name = name;
    this.address = address;
    this.phone = phone;
    this.info = info;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  public String getPhone() {
    return phone;
  }

  public String getInfo() {
    return info;
  }
}
