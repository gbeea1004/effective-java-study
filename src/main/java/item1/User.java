package item1;

public class User {
    private String name;

    private User(String name) {
        this.name = name;
    }

    public static User createUser(String name) {
        return new User(name);
    }

    public String getName() {
        return name;
    }
}
