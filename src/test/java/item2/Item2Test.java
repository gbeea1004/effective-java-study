package item2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Item2Test {
    @Test
    void 빌더패턴_사용하기_필수값() {
        Person person = new Person.Builder("성건희", 29).build();
        assertThat(person.getName()).isEqualTo("성건희");
        assertThat(person.getAge()).isEqualTo(29);
        assertThat(person.getAddress()).isEqualTo("미입력");
    }

    @Test
    void 빌더패턴_사용하기_모든값() {
        Person person = new Person.Builder("성건희", 29).address("수원").build();
        assertThat(person.getName()).isEqualTo("성건희");
        assertThat(person.getAge()).isEqualTo(29);
        assertThat(person.getAddress()).isEqualTo("수원");
    }
}
