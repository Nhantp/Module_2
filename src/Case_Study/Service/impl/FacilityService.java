package Case_Study.Service.impl;

import Case_Study.Repository.IFacilityRepository;
import Case_Study.Repository.impl.FacilityRepository;
import Case_Study.Service.IFacilityService;
import Case_Study.models.Facility;
import Case_Study.models.House;
import Case_Study.models.Room;
import Case_Study.models.Villa;
import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    IFacilityRepository iFacilityRepository = new FacilityRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addHouse() {
        House house = this.infoHouse();
        iFacilityRepository.add(house);
    }

    @Override
    public void addRoom() {
        Room room = this.infoRoom();
        iFacilityRepository.add(room);
    }

    @Override
    public void addVilla() {
        Villa villa = this.infoVilla();
        iFacilityRepository.add(villa);
    }

    @Override
    public void add() {

    }

    @Override
    public void display() {
        Map<Facility, Integer> linkedHashMap = iFacilityRepository.findAll();
        for (Map.Entry<Facility, Integer> entry: linkedHashMap.entrySet()) {
            System.out.println(entry);

        }
    }

    public Room infoRoom() {
        System.out.println("Nhap vao ten dich vu: ");
        String serviceName = scanner.nextLine();
        System.out.println("Nhap vao dien tich su dung: ");
        double usableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap vao thue: ");
        double rentalCost = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap vao so nguoi toi da:");
        int maxPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao kieu thue: ");
        String rentalType = scanner.nextLine();
        System.out.println("Nhap vao dich vu mien phi di kem: ");
        String freeService = scanner.nextLine();
        return new Room(serviceName, usableArea, rentalCost, maxPeople, rentalType, freeService);
    }

    public House infoHouse() {
        System.out.println("Nhap vao ten dich vu: ");
        String serviceName = scanner.nextLine();
        System.out.println("Nhap vao dien tich su dung: ");
        double usableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap vao thue: ");
        double rentalCost = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap vao so nguoi toi da:");
        int maxPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao kieu thue: ");
        String rentalType = scanner.nextLine();
        System.out.println("Nhap vao tieu chuan phong: ");
        String roomStandard = scanner.nextLine();
        System.out.println("Nhap vao so tang: ");
        int floor = Integer.parseInt(scanner.nextLine());
        return new House(serviceName, usableArea, rentalCost, maxPeople, rentalType, roomStandard, floor);
    }

    public Villa infoVilla() {
        System.out.println("Nhap vao ten dich vu: ");
        String serviceName = scanner.nextLine();
        System.out.println("Nhap vao dien tich su dung: ");
        double usableArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap vao thue: ");
        double rentalCost = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap vao so nguoi toi da:");
        int maxPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao kieu thue: ");
        String rentalType = scanner.nextLine();
        System.out.println("Nhap vao tieu chuan phong: ");
        String roomStandard = scanner.nextLine();
        System.out.println("Nhap vao dien tich ho boi: ");
        double lakeArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap vao so tang: ");
        int floor = Integer.parseInt(scanner.nextLine());
        return new Villa(serviceName, usableArea, rentalCost, maxPeople, rentalType, roomStandard, lakeArea, floor);
    }
}
