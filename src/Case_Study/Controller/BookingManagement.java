package Case_Study.Controller;

import Case_Study.Service.IBookingService;
import Case_Study.Service.impl.BookingService;

import java.util.Scanner;

public class BookingManagement {
    Scanner scanner=new Scanner(System.in);
    IBookingService iBookingService=new BookingService();
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
                    iBookingService.displayBooking();
                    break;
                }
                case 2:{
                    iBookingService.addBooking();
                    break;
                }
                case 3:{
//                    iBookingService.addContracts();
                    break;
                }
                case 4:{
//                    iBookingService.displayContracts();
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
