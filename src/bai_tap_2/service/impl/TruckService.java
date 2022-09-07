package bai_tap_2.service.impl;

import bai_tap_2.model.Truck;
import bai_tap_2.repository.ITruckRepository;
import bai_tap_2.repository.impl.TruckRepository;
import bai_tap_2.service.ITruckService;

import java.util.List;
import java.util.Scanner;

public class TruckService implements ITruckService {
    ITruckRepository iTruckRepository=new TruckRepository();
    Scanner scanner=new Scanner(System.in);
    @Override
    public void addTruck() {
        Truck truck=this.infoTruck();
        iTruckRepository.addTruck(truck);
    }

    @Override
    public void displayTruck() {
        List<Truck> truckList=iTruckRepository.getAll();
        for (Truck truck:truckList){
            System.out.println(truck);
        }
    }


    @Override
    public void searchTruck(String bienSoXe) {
        List<Truck> truckList=iTruckRepository.getAll();
        for (Truck truck:truckList){
            if(truck.getBienSoXe().equals(bienSoXe)){
                System.out.println(truck);
            }
        }
    }

    public Truck infoTruck() {
        System.out.println("Nhập vào biển kiểm soát: ");
        String licensePlates = scanner.nextLine();
        System.out.println("Nhập vào tên hãng sản xuất: ");
        String brandName = scanner.nextLine();
        System.out.println("Nhập vào năm sản xuất: ");
        String yearOfManufacture = scanner.nextLine();
        System.out.println("Nhập vào chủ sở hữu: ");
        String owner = scanner.nextLine();
        System.out.println("Nhập vào số chỗ ngồi: ");
        double tonnage = Double.parseDouble(scanner.nextLine());
        Truck truck=new Truck(licensePlates,brandName,yearOfManufacture,owner,tonnage);
        return truck;
    }
}
