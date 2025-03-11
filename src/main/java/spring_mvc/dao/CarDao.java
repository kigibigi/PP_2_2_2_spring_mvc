package spring_mvc.dao;

import spring_mvc.model.Car;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarDao {
    List<Car> getCarsByOrder(Integer index);
}
