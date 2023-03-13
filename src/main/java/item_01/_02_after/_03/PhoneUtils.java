package item_01._02_after._03;

public class PhoneUtils {

    private PhoneUtils() {
    }

    public static Phone getPhone(PhoneType phoneType) {
        if (phoneType == PhoneType.IPHONE) {
            return new IPhone();
        }

        if (phoneType == PhoneType.SAMSUNG) {
            return new SamsungPhone();
        }

        throw new IllegalArgumentException("등록된 핸드폰 타입이 없습니다. phoneType:" + phoneType);
    }
}
