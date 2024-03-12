package day4.chap4;

public class InstanceVarDemo {
  public static void main(String[] args) {
    InstanceVarClass.methodstatic(); //이거 할때는 static 별수만 미리 올라감.
    System.out.println(InstanceVarClass.common);

    InstanceVarClass i1 = new InstanceVarClass(); // 이때는 힙애ㅔ 들어감
    i1.instanceVar ++;
    System.out.println(i1.instanceVar);

    InstanceVarClass i2 = new InstanceVarClass(); // 이때는 힙애ㅔ 들어감
    i1.instanceVar ++;
    System.out.println(i2.instanceVar);

    InstanceVarClass i3 = new InstanceVarClass(); // 이때는 힙애ㅔ 들어감
    i1.instanceVar ++;
    System.out.println(i3.instanceVar);
  }
}
