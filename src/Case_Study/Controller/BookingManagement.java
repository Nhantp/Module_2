package Case_Study.Controller;

import java.util.Scanner;

public class BookingManagement {
    private final Scanner scanner=new Scanner(System.in);
    public void bookingMenu() {
        do {
            System.out.println("1.Display list booking.");
            System.out.println("2.Add new booking.");
            System.out.println("3.Edit constructs.");
            System.out.println("3.Display constructs.");
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
