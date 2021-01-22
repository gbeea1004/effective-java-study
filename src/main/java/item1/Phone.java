package item1;

public class Phone {
    private static Phone phone;

    private Phone() {}

    public static Phone createPhone() {
        if (phone == null) {
            phone = new Phone();
        }
        return phone;
    }
}
