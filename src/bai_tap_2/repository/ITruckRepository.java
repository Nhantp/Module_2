package bai_tap_2.repository;

import bai_tap_2.model.Truck;

import java.util.List;

public interface ITruckRepository {
    void addTruck(Truck truck);

    List<Truck> getAll();
}
