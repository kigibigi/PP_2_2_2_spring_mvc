package dao;

import java.util.ArrayList;
import java.util.List;
import model.Car;
import org.springframework.stereotype.Component;

@Component
public class CarDAO {
    private static int CARS_COUNT = 1;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(CARS_COUNT++, "Car1", 11));
        cars.add(new Car(CARS_COUNT++, "Car2", 22));
        cars.add(new Car(CARS_COUNT++, "Car3", 33));
        cars.add(new Car(CARS_COUNT++, "Car4", 44));
        cars.add(new Car(CARS_COUNT++, "Car5", 55));
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getCarsByOrder(int index) {
        return cars.stream()
                .limit(index).toList();
    }
}
