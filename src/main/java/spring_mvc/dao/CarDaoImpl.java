package spring_mvc.dao;

import java.util.ArrayList;
import java.util.List;
import spring_mvc.model.Car;
import org.springframework.stereotype.Repository;

@Repository
public class CarDaoImpl implements CarDao {
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

    @Override
    public List<Car> getCarsByOrder(Integer index) {
        return index != null ? cars.stream().limit(index).toList()
                             : cars;
    }
}
