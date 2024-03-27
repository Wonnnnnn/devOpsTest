package day17.libraryproject;

import java.util.Date;

public class Checkout {
  private int id;
  private int libId;
  private int bookID;
  private int userid;
  private Date checkoutDate;
  private Date tobeReturnDate;
  private boolean renew;
  private Date checkinDate;
  private Date renewReturnDate;

  public Checkout(int id, int libId, int bookID, int userid, Date checkoutDate, Date tobeReturnDate, boolean renew, Date checkinDate, Date renewReturnDate) {
    this.id = id;
    this.libId = libId;
    this.bookID = bookID;
    this.userid = userid;
    this.checkoutDate = checkoutDate;
    this.tobeReturnDate = tobeReturnDate;
    this.renew = renew;
    this.checkinDate = checkinDate;
    this.renewReturnDate = renewReturnDate;
  }

  public int getId() {
    return id;
  }

  public int getLibId() {
    return libId;
  }

  public int getBookID() {
    return bookID;
  }

  public int getUserid() {
    return userid;
  }

  public Date getCheckoutDate() {
    return checkoutDate;
  }

  public Date getTobeReturnDate() {
    return tobeReturnDate;
  }

  public boolean isRenew() {
    return renew;
  }

  public Date getCheckinDate() {
    return checkinDate;
  }

  public Date getRenewReturnDate() {
    return renewReturnDate;
  }
}
