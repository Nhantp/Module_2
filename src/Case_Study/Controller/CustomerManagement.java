package Case_Study.Controller;

import Case_Study.Service.ICustomerService;
import Case_Study.Service.impl.CustomerService;

import java.util.Scanner;

public class CustomerManagement {
    Scanner scanner=new Scanner(System.in);
    ICustomerService iCustomerService=new CustomerService();
    public void customerMenu() {
        do {
            System.out.println("1.Display list customer.");
            System.out.println("2.Add new customer.");
            System.out.println("3.Edit customer.");
            System.out.println("4.Return main menu.");
            System.out.println("Enter selection.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    iCustomerService.display();
                    break;
                }
                case 2:{
                    iCustomerService.add();
                    break;
                }
                case 3:{
                    System.out.println("Nhap vao id khach hang can sua:");
                    String id=scanner.nextLine();
                    iCustomerService.edit(id);
                    break;
                }
                case 4:{
                    return;
                }
            }
        } while (true);
    }
}
