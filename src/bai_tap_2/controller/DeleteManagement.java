package bai_tap_2.controller;

import bai_tap_2.service.ICarService;
import bai_tap_2.service.IMotoBikeService;
import bai_tap_2.service.ITruckService;
import bai_tap_2.service.impl.CarService;
import bai_tap_2.service.impl.MotoBikeService;
import bai_tap_2.service.impl.TruckService;

import java.net.BindException;
import java.util.Scanner;

public class DeleteManagement {
    private static final Scanner scanner=new Scanner(System.in);
    private static ICarService iCarService=new CarService();
    private static ITruckService iTruckService=new TruckService();
    private static IMotoBikeService iMotoBikeService=new MotoBikeService();
    public static void deleteMenu() {
        do {
            System.out.println("1.Xóa ô tô.");
            System.out.println("2.Xóa xe tải.");
            System.out.println("3.Xóa Xe máy.");
            System.out.println("4.Quay lại.");
            System.out.println("Nhập vào lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    int index = Integer.parseInt(scanner.nextLine());
                    iCarService.removeCar(index);
                    break;
                }
                case 2: {
//                    iTruckService.removeTruck();
                    break;
                }
                case 3: {
                    iMotoBikeService.displayMotoBike();
                    break;

                }
                case 4: {
                    return;
                }
            }
        } while (true);
    }
    }
