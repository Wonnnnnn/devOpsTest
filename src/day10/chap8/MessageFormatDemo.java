package day10.chap8;

import java.text.MessageFormat;

public class MessageFormatDemo {
  public static void main(String[] args) {
    String java = "java";
    int version = 17;

    System.out.println(MessageFormat.format("language : {0}, version: {1}", java, version));// 만약 1번을 두개 쓰면 뒤에 안써도 두번 나옴
    System.out.println(MessageFormat.format("ver : {1}, lang: {0}, ver: {1}",new Object[]{1,2,3}));
  }
}
