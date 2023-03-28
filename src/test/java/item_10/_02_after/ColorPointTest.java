package item_10._02_after;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ColorPointTest {

    @DisplayName("추이성 성공")
    @Test
    void testTransitivity_success() {
        Point point = new Point(1, 1);
        ColorPoint colorPoint = new ColorPoint(1, 1, new Color("red"));
        ColorPoint colorPoint2 = new ColorPoint(1, 1, new Color("black"));

        assertThat(point.equals(colorPoint)).isFalse();
        assertThat(colorPoint.equals(colorPoint2)).isFalse();
        assertThat(colorPoint2.equals(point)).isFalse();
    }
}