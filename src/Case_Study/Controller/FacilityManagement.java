package Case_Study.Controller;

import java.util.Scanner;

public class FacilityManagement {
    private final Scanner scanner=new Scanner(System.in);
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
                }
            }

        } while (true);
    }
}
