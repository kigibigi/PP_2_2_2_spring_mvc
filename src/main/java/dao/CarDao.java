package dao;

import model.Car;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarDao {

    List<Car> getCars();

    List<Car> getCarsByOrder(int index);
}
