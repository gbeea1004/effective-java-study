package item_10._01_before;

import java.util.Objects;

public class Text {

    private String contents;

    public Text(String contents) {
        this.contents = contents;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Text) {
            return contents.equalsIgnoreCase(((Text) o).contents);
        }

        if (o instanceof String) {
            return contents.equalsIgnoreCase((String) o);
        }

        return false;
    }
}
