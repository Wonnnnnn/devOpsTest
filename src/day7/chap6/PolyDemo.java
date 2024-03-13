package day7.chap6;

public class PolyDemo {
  public static void main(String[] args) {
    Person[] people = new Person[3];
    Student s = new Student();
    Employee e = new Employee();
    Person p = new Person();

    people[0] = p;
    people[1] = s;
    people[2] = e;

    check(p);
    check(s);
    check(e);

  }

  static void check(Person p) {
    System.out.println("check 입니다.");
  }
}
