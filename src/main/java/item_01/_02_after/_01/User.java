package item_01._02_after._01;

public class User {

    private String name;
    private int age;

    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static User crateChildren(String name) {
        return new User(name, 10);
    }

    public static User crateAdult(String name) {
        return new User(name, 20);
    }
}
