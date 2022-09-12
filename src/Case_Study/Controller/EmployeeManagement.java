package Case_Study.Controller;

import java.util.Scanner;

public class EmployeeManagement {
    private final Scanner scanner=new Scanner(System.in);
    public void customerMenu() {
        do {
            System.out.println("1.Display list employee.");
            System.out.println("2.Add new employee.");
            System.out.println("3.Edit employee.");
            System.out.println("4.Return main menu.");
            System.out.println("Enter selection.");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                }
            }

        } while (true);
    }

}
