package item_10._02_after;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TextTest {

    @DisplayName("대칭성 성공")
    @Test
    void testSymmetry_success() {
        // given
        Text object = new Text("Test");
        String string = "test";

        // when
        // then
        assertThat(object.equals(string)).isFalse();
        assertThat(string.equals(object)).isFalse();
    }
}