package day4.chap4;

class Person {
  private String name;
  private int age;

  public Person setName(String name) {
    this.name = name;
    return this;
  }

  public Person setAge(int age) {
    if(age>0) {
      this.age = age;
      return this;
    }
    else {
      System.out.println("나이를 잘못입력하셨습니다.");
      return this;
    }
  }

  public void sayHello() {
    System.out.printf("안녕, 나는 %s이고 %d살이야.\n",name, age);
  }
}
