package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCarList(int count) {

        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Toyota", "Corolla", 111222));
        carList.add(new Car("Ferrari", "488", 222333));
        carList.add(new Car("Mercedes-Benz", "E63 AMG", 333444));
        carList.add(new Car("Audi", "A4", 444555));
        carList.add(new Car("Ford", "Mustang", 555666));

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
