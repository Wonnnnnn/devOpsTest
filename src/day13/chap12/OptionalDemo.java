package day13.chap12;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class OptionalDemo {
  public static void main(String[] args) {
    OptionalInt i = OptionalInt.of(100);
    OptionalDouble d = OptionalDouble.of(3.14);
    Optional<String> hello = Optional.of("hello");

    Util.printLn(i);
    Util.printWithParenthesisLn(i.getAsInt());

    Util.printLn(d);
    Util.printWithParenthesisLn(d.getAsDouble());

    Util.printLn(hello);
    Util.printWithParenthesisLn(hello.get());

    System.out.println(1.0 / 2.0);
    System.out.println(1.0/0.0);

    System.out.println(divde(1.0,2.0).getAsDouble());
    System.out.println(divde(1.0, 0.0));
    System.out.println(divde(1.0, 0.0).isEmpty());

    System.out.println(Optional.ofNullable("a"));
    System.out.println(Optional.ofNullable(null));

    Util.printLn(Optional.ofNullable(null).orElse("값이 없음"));
    Util.printLn(Optional.ofNullable(null).orElse("a"));

    Optional<String> o = Optional.ofNullable("안녕");
    Optional<String> o1 = Optional.ofNullable(null);
    o.ifPresent(Util::printWithParenthesisLn);
    o.ifPresentOrElse(Util::printWithParenthesisLn, () -> System.out.println("없음"));
    o1.ifPresentOrElse(Util::printWithParenthesisLn, () -> System.out.println("없음"));

  }
  static OptionalDouble divde(double x, double y){
    return y==0?OptionalDouble.empty():OptionalDouble.of(x/y);
  };
}
