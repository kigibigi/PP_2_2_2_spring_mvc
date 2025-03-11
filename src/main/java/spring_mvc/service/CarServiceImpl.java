package spring_mvc.service;

import spring_mvc.dao.CarDao;
import spring_mvc.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCarsByOrder(Integer index) {
        return carDao.getCarsByOrder(index);
    }
}
