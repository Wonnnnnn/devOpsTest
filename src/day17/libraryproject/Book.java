package day17.libraryproject;

public class Book {
  private int id;
  private int libId;
  private String bookname;
  private String writername;
  private String publisher;
  private String bookClass;
  private String isbn;
  private String kubun; // enum
  private String status; // enum

  public Book(int id, int libId, String bookname, String writername, String publisher, String bookClass, String isbn, String kubun, String status) {
    this.id = id;
    this.libId = libId;
    this.bookname = bookname;
    this.writername = writername;
    this.publisher = publisher;
    this.bookClass = bookClass;
    this.isbn = isbn;
    this.kubun = kubun;
    this.status = status;
  }

  public int getId() {
    return id;
  }

  public int getLibId() {
    return libId;
  }

  public String getBookname() {
    return bookname;
  }

  public String getWritername() {
    return writername;
  }

  public String getPublisher() {
    return publisher;
  }

  public String getBookClass() {
    return bookClass;
  }

  public String getIsbn() {
    return isbn;
  }

  public String getKubun() {
    return kubun;
  }

  public String getStatus() {
    return status;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setLibId(int libId) {
    this.libId = libId;
  }

  public void setBookname(String bookname) {
    this.bookname = bookname;
  }

  public void setWritername(String writername) {
    this.writername = writername;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public void setBookClass(String bookClass) {
    this.bookClass = bookClass;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public void setKubun(String kubun) {
    this.kubun = kubun;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "Book[" + id + "," + bookname + "]";
  }
}
