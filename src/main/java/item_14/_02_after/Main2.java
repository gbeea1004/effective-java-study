package item_14._02_after;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        Car car1 = new Car(10, 5);
        Car car2 = new Car(2, 1);
        Car car3 = new Car(5, 2);
        Car car4 = new Car(10, 3);

        System.out.println(car1.compareTo(car2));

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        Collections.sort(cars);
        System.out.println("cars.toString() = " + cars.toString());
    }
}
