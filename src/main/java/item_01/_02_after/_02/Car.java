package item_01._02_after._02;

public class Car {

    private static final Car SPORTS_CAR = new Car("페라리");
    private static final Car NORMAL_CAR = new Car("아반떼");

    private String name;

    private Car(String name) {
        this.name = name;
    }

    public static Car createCar(boolean isSportsCar) {
        return isSportsCar ? SPORTS_CAR : NORMAL_CAR;
    }
}
