package spring_mvc.service;

import spring_mvc.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarService {

    List<Car> getCarsByOrder(Integer index);
}
