package service;

import dao.CarDao;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceListImpl implements CarService{

    private CarDao carDao;

    @Autowired
    public CarServiceListImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars() {
        return carDao.getCars();
    }

    @Override
    public List<Car> getCarsByOrder(int index) {
        return carDao.getCarsByOrder(index);
    }
}
