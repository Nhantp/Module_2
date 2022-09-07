package bai_tap_2.controller;
import bai_tap_2.service.ICarService;
import bai_tap_2.service.IMotoBikeService;
import bai_tap_2.service.ITruckService;
import bai_tap_2.service.impl.CarService;
import bai_tap_2.service.impl.MotoBikeService;
import bai_tap_2.service.impl.TruckService;
import java.util.Scanner;

public class AddManagement {
    private static final Scanner scanner=new Scanner(System.in);
    private static final ICarService iCarService=new CarService();
    private static final ITruckService iTruckService=new TruckService();
    private static final IMotoBikeService iMotoBikeService=new MotoBikeService();
    public static void addMenu(){
        do {
            System.out.println("1.Thêm ô tô.");
            System.out.println("2.Thêm xe tải.");
            System.out.println("3.Thêm Xe máy.");
            System.out.println("4.Quay lại.");
            System.out.println("Nhập vào lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:{
                    iCarService.addCar();
                    break;
                }
                case 2:{
                    iTruckService.addTruck();
                    break;
                }
                case 3:{
                    iMotoBikeService.addMotoBike();
                    break;

                }
                case 4:{
                    return;
                }
            }
        }while (true);
    }
}
