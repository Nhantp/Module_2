package Case_Study.Controller;

import Case_Study.Service.IBookingService;
import Case_Study.Service.IContractService;
import Case_Study.Service.ICustomerService;
import Case_Study.Service.IFacilityService;
import Case_Study.Service.impl.BookingService;
import Case_Study.Service.impl.ContractService;
import Case_Study.Service.impl.CustomerService;
import Case_Study.Service.impl.FacilityService;
import Case_Study.models.Booking;

import java.util.Scanner;

public class BookingManagement {
    Scanner scanner=new Scanner(System.in);
    IBookingService iBookingService=new BookingService();
    IContractService iContractService=new ContractService();
    public void bookingMenu() {
        do {
            System.out.println("1.Add new booking.");
            System.out.println("2.Display list booking.");
            System.out.println("3.Create new contracts.");
            System.out.println("4.Display list contracts.");
            System.out.println("5.Edit contracts.");
            System.out.println("6.Return main menu.");
            System.out.println("Enter selection.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
//                    iCustomerService.add();
//                    System.out.println("Nhap vao dich vu: ");
//                    System.out.println("1.Villa.");
//                    System.out.println("2.House.");
//                    System.out.println("3.Home");
//                    System.out.println("Nhap lua chon:");
                    iBookingService.addBooking();
                    break;
                }
                case 2:{
                    iBookingService.displayBooking();

                    break;
                }
                case 3:{
                    iContractService.add();
                    break;
                }
                case 4:{
                    iContractService.display();
                    break;
                }
                case 5:{

                }
                case 6:{
                    return;
                }

            }

        } while (true);
    }
}
