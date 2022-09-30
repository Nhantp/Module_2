package Case_Study.Controller;

import Case_Study.Service.IEmployeeService;
import Case_Study.Service.impl.EmployeeService;

import java.util.Scanner;

public class EmployeeManagement {
    IEmployeeService iEmployeeService=new EmployeeService();
    private final Scanner scanner=new Scanner(System.in);
    public void employeeMenu() {
        do {
            System.out.println("1.Display list employee.");
            System.out.println("2.Add new employee.");
            System.out.println("3.Edit employee.");
            System.out.println("4.Return main menu.");
            System.out.println("Enter selection.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    iEmployeeService.display();
                    break;
                }
                case 2:{
                    iEmployeeService.add();
                    break;
                }
                case 3:{
                    System.out.println("Nhap vao id nhan vien can sua:");
                    String id=scanner.nextLine();
                    iEmployeeService.edit(id);
                    break;
                }
                case 4:{
                    return;
                }
            }

        } while (true);
    }

}
