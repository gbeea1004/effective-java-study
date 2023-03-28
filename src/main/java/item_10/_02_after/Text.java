package item_10._02_after;

public class Text {

    private String contents;

    public Text(String contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Text && contents.equalsIgnoreCase(((Text) o).contents);
    }
}
