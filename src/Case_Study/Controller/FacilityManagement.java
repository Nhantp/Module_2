package Case_Study.Controller;

import Case_Study.Service.IFacilityService;
import Case_Study.Service.impl.FacilityService;

import java.util.Scanner;

public class FacilityManagement {
    IFacilityService iFacilityService=new FacilityService();
    Scanner scanner=new Scanner(System.in);

    public void facilityMenu() {
        do {
            System.out.println("1.Display list facility.");
            System.out.println("2.Add new facility.");
            System.out.println("3.Display maintenance.");
            System.out.println("4.Return main menu.");
            System.out.println("Enter selection.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    iFacilityService.display();
                    break;
                }
                case 2:{
                    addMenu();
                    break;
                }
                case 3:{
                    break;
                }
                case 4:{
                    return;
                }
            }
        } while (true);
    }
    public void addMenu(){
        do {
            System.out.println("1.Add new villa.");
            System.out.println("2.Add new house.");
            System.out.println("3.Add new Room.");
            System.out.println("4.Return menu.");
            System.out.println("Nhap vao lua chon:");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:{
                    iFacilityService.addVilla();
                    break;
                }
                case 2:{
                    iFacilityService.addHouse();
                    break;
                }
                case 3:{
                    iFacilityService.addRoom();
                    break;
                }
                case 4:{
                    return;
                }
            }
        }while (true);
    }
}
