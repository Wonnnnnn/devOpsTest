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

    people[1] = (Student)people[1];

    check(p);
    check(s);
    check(e);
    people[1].whoami();

  }

  static void check(Person p) {
    System.out.println("check 입니다.");
  }
}
