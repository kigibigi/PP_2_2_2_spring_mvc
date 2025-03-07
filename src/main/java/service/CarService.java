package service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarService {

    List<Car> getCars();

    List<Car> getCarsByOrder(int index);
}
