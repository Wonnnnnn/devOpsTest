package day7.chap5;

public class EnumDemo {
  public static void main(String[] args) {
    Gender gender = Gender.MALE;
    Gender gender1 = Gender.FEMALE;

    if (gender == Gender.MALE) {
      System.out.println(gender + "는 병역의 의무가 있다.");
    } else {
      System.out.println(gender + "는 병역의 의무가 없다.");
    }

    if (gender1 == Gender.MALE) {
      System.out.println(gender1 + "는 병역의 의무가 있다.");
    } else {
      System.out.println(gender1 + "는 병역의 의무가 없다.");
    }

    System.out.println(gender.name());
    System.out.println(Gender.valueOf(gender.name()));
    System.out.println(Gender.valueOf(gender1.name()));
    System.out.println(gender.ordinal());
    System.out.println(gender1.ordinal());
  }
}
