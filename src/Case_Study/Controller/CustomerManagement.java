package Case_Study.Controller;

import java.util.Scanner;

public class CustomerManagement {
    private final Scanner scanner=new Scanner(System.in);
    public void employeeMenu() {
        do {
            System.out.println("1.Display list customer.");
            System.out.println("2.Add new customer.");
            System.out.println("3.Edit customer.");
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
