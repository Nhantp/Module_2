package bai_tap_2.service.impl;

import bai_tap_2.model.Car;
import bai_tap_2.repository.ICarRepository;
import bai_tap_2.repository.impl.CarRepository;
import bai_tap_2.service.ICarService;

import java.util.List;
import java.util.Scanner;

public class CarService implements ICarService {
    private final Scanner scanner = new Scanner(System.in);
    private final ICarRepository iCarRepository=new CarRepository();

    @Override
    public void addCar() {
        Car car = this.infoCar();
        iCarRepository.addCar(car);

    }

    @Override
    public void displayCar() {
        List<Car> carList=iCarRepository.getAll();
        for (Car car:carList){
            System.out.println(car.toString());
        }
    }


    @Override
    public void searchCar(String bienSoXe) {
        List<Car> carList=iCarRepository.getAll();
        for (Car car:carList){
            if(car.getBienSoXe().equals(bienSoXe)){
                System.out.println(car);
            }
        }

    }


    @Override
    public void removeCar(int bienSoxe) {
        List<Car> carList=iCarRepository.getAll();
//        if(carList.indexOf(bienSoxe)){

        }
//        System.out.println("Nhập vào biển số xe cần xóa:");
//        List<Car>carList=iCarRepository.getAll();
//        String index=scanner.nextLine();
//        for (int i=0; i<carList.size(); i++){
//            if(index.equals(carList.get(i).getBienSoXe())){
//                carList.remove(i);
//            }
//        }
//    }

    public Car infoCar() {
        System.out.println("Nhập vào biển kiểm soát: ");
        String bienSoXe = scanner.nextLine();
        System.out.println("Nhập vào tên hãng sản xuất: ");
        String tenHang = scanner.nextLine();
        System.out.println("Nhập vào năm sản xuất: ");
        String namSanXuat = scanner.nextLine();
        System.out.println("Nhập vào chủ sở hữu: ");
        String nguoiSoHuu = scanner.nextLine();
        System.out.println("Nhập vào số chỗ ngồi: ");
        int soChoNgoi = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào kiểu xe: ");
        String kieuXe = scanner.nextLine();
        Car car=new Car(bienSoXe,tenHang,namSanXuat,nguoiSoHuu,soChoNgoi,kieuXe);
        return car;
    }
}
