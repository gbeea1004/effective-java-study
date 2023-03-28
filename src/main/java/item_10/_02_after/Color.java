package item_10._02_after;

public class Color {

    private String color;

    public Color(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Color)) {
            return false;
        }
        Color color = (Color) o;
        return this.color.equals(color.color);
    }
}
