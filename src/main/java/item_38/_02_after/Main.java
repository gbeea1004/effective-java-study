package item_38._02_after;

import java.util.Collection;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    double result = BasicOperation.PLUS.apply(1, 2);
    System.out.println("result = " + result);

    double a = 1.0;
    double b = 2.0;
    test(BasicOperation.class, a, b);

    System.out.println("============================");

    test2(List.of(BasicOperation.values()), a, b);
  }

  private static <T extends Enum<T> & Operation> void test(Class<T> opEnumType, double x, double y) {
    for (Operation operation : opEnumType.getEnumConstants()) {
      System.out.println("operation " + operation + " = " + operation.apply(x, y));
    }
  }

  private static void test2(Collection<? extends Operation> enums, double x, double y) {
    for (Operation operation : enums) {
      System.out.println("operation " + operation + " = " + operation.apply(x, y));
    }
  }
}
