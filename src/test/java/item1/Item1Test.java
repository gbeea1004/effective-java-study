package item1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Item1Test {

    @Test
    @DisplayName("정적 팩토리 메서드 사용")
    void useStaticFactoryMethod() {
        assertThat(valueOf(true)).isEqualTo(Boolean.TRUE);
        assertThat(valueOf(false)).isEqualTo(Boolean.FALSE);
    }

    @Test
    @DisplayName("생성자 대신 정적 팩토리 메서드 사용")
    void useStaticFactoryMethodWithoutConstruct() {
        User user = User.createUser("성건희");

        assertThat(user.getName()).isEqualTo("성건희");
    }

    @Test
    @DisplayName("정적 팩토리 메서드는 호출할 때마다 인스턴스를 새로 생성하지 않는다")
    void notCreateInstanceIsCalledWhenUseStaticFactoryMethod() {
        Phone phone1 = Phone.createPhone();
        Phone phone2 = Phone.createPhone();

        assertThat(phone1).isSameAs(phone2);
    }

    @Test
    @DisplayName("정적 팩토리 메서드는 하위 타입 객체를 반환할 수 있다")
    void returnSubtypeObjectWhenUseStaticFactoryMethod() {
        assertThat(Fruit.createBanana()).isInstanceOf(Banana.class);
        assertThat(Fruit.createApple()).isInstanceOf(Apple.class);
    }

    @Test
    @DisplayName("정적 팩토리 메서드를 작성하는 시점에는 반환할 객체의 클래스가 존재하지 않아도 된다")
    void canNotReturnObjectClassWhenUseStaticFactoryMethod() {
        Company nhn = Company.getInstance("item1.Nhn");
        assertThat(nhn.getCompanyName()).isEqualTo("NHN");

        Company kakao = Company.getInstance("item1s.kakao"); // 존재하지 않는 path
        assertThat(kakao.getCompanyName()).isEqualTo("KAKAO"); // 에러
    }

    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
}
