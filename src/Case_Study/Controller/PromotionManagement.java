package Case_Study.Controller;

import java.util.Scanner;

public class PromotionManagement {
    private final Scanner scanner=new Scanner(System.in);
    public void promotionMenu() {
        do {
            System.out.println("1.Display list customers use service.");
            System.out.println("2.Display list customer get voucher.");
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
