package item_32;

import java.util.ArrayList;
import java.util.List;

public class Step1 {

  public static void main(String[] args) {
    List<String> texts = List.of("하이");
    dangerous(texts);
  }

  private static void dangerous(List<String>... stringLists) {
    Object[] objects = stringLists;
    List<Integer> intList = List.of(42);
    objects[0] = intList;
    String s = stringLists[0].get(0);
  }
}
