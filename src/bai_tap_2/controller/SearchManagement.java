package bai_tap_2.controller;

import bai_tap_2.model.Car;
import bai_tap_2.model.Vehicle;
import bai_tap_2.service.ICarService;
import bai_tap_2.service.IMotoBikeService;
import bai_tap_2.service.ITruckService;
import bai_tap_2.service.impl.CarService;
import bai_tap_2.service.impl.MotoBikeService;
import bai_tap_2.service.impl.TruckService;

import java.util.Scanner;

public class SearchManagement {
    private static final Scanner scanner=new Scanner(System.in);
    private static final ICarService<Vehicle> iCarService=new CarService();
    private static final ITruckService iTruckService=new TruckService();
    private static final IMotoBikeService iMotoBikeService=new MotoBikeService();

    public static void searchMenu() {

        do {
            System.out.println("1.Tìm kiếm ô tô.");
            System.out.println("2.Tìm kiếm xe tải.");
            System.out.println("3.Tìm kiếm Xe máy.");
            System.out.println("4.Quay lại.");
            System.out.println("Nhập vào lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    System.out.println("Nhập vào biển số xe:");
                    String bienSoXe= scanner.nextLine();
                    iCarService.searchCar(bienSoXe);
                    break;
                }
                case 2: {
                    System.out.println("Nhập vào biển số xe:");
                    String bienSoXe= scanner.nextLine();
                    iTruckService.searchTruck(bienSoXe);
                    break;
                }
                case 3: {
                    System.out.println("Nhập vào biển số xe:");
                    String bienSoXe= scanner.nextLine();
                    iMotoBikeService.searchMotoBike(bienSoXe);
                    break;
                }
                case 4: {
                    return;
                }
            }
        } while (true);
    }
}
