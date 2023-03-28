package item_10._01_before;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TextTest {

    @DisplayName("대칭성 위배")
    @Test
    void testSymmetry_fail() {
        // given
        Text object = new Text("Test");
        String string = "test";

        // when
        // then
        assertThat(object.equals(string)).isTrue();
        assertThat(string.equals(object)).isFalse();
    }
}