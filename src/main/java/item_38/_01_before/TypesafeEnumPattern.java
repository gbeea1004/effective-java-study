package item_38._01_before;

/**
 * 타입 안전 열거 패턴
 */
public class TypesafeEnumPattern {

  public static final TypesafeEnumPattern a = new TypesafeEnumPattern("A");
  public static final TypesafeEnumPattern b = new TypesafeEnumPattern("B");
  public static final TypesafeEnumPattern c = new TypesafeEnumPattern("C");

  private final String type;

  private TypesafeEnumPattern(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }
}
