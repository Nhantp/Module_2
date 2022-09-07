package bai_tap_2.service;

import bai_tap_2.model.Vehicle;

public interface ICarService<C extends Vehicle> {
    void addCar();

    void displayCar();

    void searchCar(String bienSoXe);
    void removeCar();
}
