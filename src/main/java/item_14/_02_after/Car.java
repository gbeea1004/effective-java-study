package item_14._02_after;

import java.util.Comparator;

public class Car implements Comparable<Car> {
    private static final Comparator<Car> COMPARATOR = Comparator.comparingInt((Car car) -> car.speed)
            .thenComparingInt(car -> car.level);

    private int speed;
    private int level;

    public Car(int speed, int level) {
        this.speed = speed;
        this.level = level;
    }

    @Override
    public int compareTo(Car car) {
        return COMPARATOR.compare(this, car);
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", level=" + level +
                '}';
    }
}
