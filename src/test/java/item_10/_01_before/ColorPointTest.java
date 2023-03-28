package item_10._01_before;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ColorPointTest {

    @DisplayName("추이성 위배")
    @Test
    void testTransitivity_fail() {
        Point point = new Point(1, 1);
        ColorPoint colorPoint = new ColorPoint(1, 1, "red");
        ColorPoint colorPoint2 = new ColorPoint(1, 1, "black");

        assertThat(point.equals(colorPoint)).isTrue();
        assertThat(colorPoint.equals(colorPoint2)).isFalse();
        assertThat(colorPoint2.equals(point)).isTrue();
    }
}