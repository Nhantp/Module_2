package Case_Study.Controller;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        EmployeeManagement employeeManagement=new EmployeeManagement();
        CustomerManagement customerManagement=new CustomerManagement();
        FacilityManagement facilityManagement=new FacilityManagement();
        BookingManagement bookingManagement=new BookingManagement();

        do {
            System.out.println("1.Employee");
            System.out.println("2.Customer");
            System.out.println("3.Facility");
            System.out.println("4.Booking");
            System.out.println("5.Promotion");
            System.out.println("6.Exit");
            System.out.println("Enter selection: ");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:{
                    employeeManagement.employeeMenu();
                    break;
                }
                case 2:{
                    customerManagement.customerMenu();
                    break;
                }
                case 3:{
                    facilityManagement.facilityMenu();
                    break;
                }
                case 4:{
                    bookingManagement.bookingMenu();
                    break;
                }
                case 5:{
                    break;
                }
                case 6:{
                    System.exit(0);
                }
            }
        }while (true);
    }
}
