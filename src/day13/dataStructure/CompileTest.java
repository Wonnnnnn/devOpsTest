package day13.dataStructure;

public class CompileTest {
  public static void main(String[] args) {
    MyStack<String> list = new MyStack<>();
    String[] p = {"{","(","(","(", ")",")", "}"};
    String c;
    boolean error = false;


    for (String s : p) {
      if (s.equals("{") || s.equals("(")) {
        System.out.print(s+" ");
        list.push(s);
      } else if (s.equals("}") || s.equals(")")) {
        if (!list.isEmpty()) {
          list.pop();
          System.out.print(s+" ");
        } else {
          System.out.print(s+" ");
          error = true;
        }
      }
    }

    if (!list.isEmpty()||error) {
      System.out.println("\n컴파일 실패! 식 오류입니다");
    } else {
      System.out.println("\n컴파일 성공!");
    }

//    for (String s : p) {
//      if (s.equals("{") || s.equals("(")) {
//        list.push(s);
//      } else if (s.equals("}") || s.equals(")")) {
//        if (!list.isEmpty()) {
//          c = list.pop();
//          System.out.println(list.pop());
//          if(s.equals("}")) {
//            if(c.equals("{")) {
//              error=false;
//            }
//          }
//        }
//      }
//    }
  }
}