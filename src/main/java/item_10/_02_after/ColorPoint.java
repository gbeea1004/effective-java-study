package item_10._02_after;

import java.util.Objects;

public class ColorPoint {

    private Point point;
    private Color color;

    public ColorPoint(int x, int y, Color color) {
        this.point = new Point(x, y);
        this.color = Objects.requireNonNull(color);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPoint)) {
            return false;
        }
        ColorPoint colorPoint = (ColorPoint) o;
        return colorPoint.point.equals(point) && colorPoint.color.equals(color);
    }
}
