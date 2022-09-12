package bai_tap_2.repository.impl;

import bai_tap_2.model.Truck;
import bai_tap_2.repository.ITruckRepository;

import java.util.ArrayList;
import java.util.List;

public class TruckRepository implements ITruckRepository {
    private static final List<Truck> truckList=new ArrayList<>();
    static {
        truckList.add(new Truck("111","suzuki","2022","nhan",1000));
        truckList.add(new Truck("112","suzuki","2022","nhan",1000));
        truckList.add(new Truck("113","suzuki","2022","nhan",1000));
        truckList.add(new Truck("114","suzuki","2022","nhan",1000));
        truckList.add(new Truck("115","suzuki","2022","nhan",1000));
    }

    @Override
    public void addTruck(Truck truck) {
        truckList.add(truck);
    }

    @Override
    public List<Truck> getAll() {
        return truckList;
    }
}
