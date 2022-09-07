package bai_tap_2.controller;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("1.Thêm phương tiện.");
            System.out.println("2.Hiển thị phương tiện.");
            System.out.println("3.Xóa phương tiện.");
            System.out.println("4.Tìm kiếm theo biển kiểm soát.");
            System.out.println("5.Thoát.");
            System.out.println("Nhập vào lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1: {
                    AddManagement.addMenu();
                    break;
                }
                case 2:{
                    DisplayManagement.displayMenu();
                    break;
                }
                case 3:{
                    DeleteManagement.deleteMenu();
                    break;
                }
                case 4:{
                    SearchManagement.searchMenu();
                }
                case 5:{
                    System.exit(0);
                }
            }
        } while (true);
    }
}