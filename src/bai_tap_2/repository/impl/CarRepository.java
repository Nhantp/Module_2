package bai_tap_2.repository.impl;

import bai_tap_2.model.Car;
import bai_tap_2.repository.ICarRepository;

import java.util.ArrayList;
import java.util.List;
public class CarRepository implements ICarRepository {
    private static List<Car>carList=new ArrayList<>();
    static {
        carList.add(new Car("123","Mec","2022","nhan",10,"dulich"));
        carList.add(new Car("124","Mec","2022","nhan",10,"dulich"));
        carList.add(new Car("125","Mec","2022","nhan",10,"dulich"));
        carList.add(new Car("126","Mec","2022","nhan",10,"dulich"));
        carList.add(new Car("127","Mec","2022","nhan",10,"dulich"));
    }
    @Override
    public void addCar(Car car) {
        carList.add(car);
    }

    @Override
    public List<Car> getAll() {
        return carList;
    }

}
