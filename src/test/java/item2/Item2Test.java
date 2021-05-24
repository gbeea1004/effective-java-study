package item2;

import org.junit.jupiter.api.Test;

import static item2.NyPizza.Size.SMALL;
import static item2.Pizza.Topping.*;
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

    @Test
    void 계층적으로_설계된_클래스() {
        NyPizza pizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE)
                                                  .addTopping(ONION)
                                                  .build();

        assertThat(pizza.getSize()).isEqualTo(SMALL);
        assertThat(pizza.toppings.size()).isEqualTo(2);
        assertThat(pizza.toppings.contains(ONION)).isTrue();
        assertThat(pizza.toppings.contains(SAUSAGE)).isTrue();
        assertThat(pizza.toppings.contains(HAM)).isFalse();
        assertThat(pizza.toppings.contains(MUSHROOM)).isFalse();
        assertThat(pizza.toppings.contains(PEPPER)).isFalse();
    }
}
