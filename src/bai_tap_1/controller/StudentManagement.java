package bai_tap_1.controller;

import bai_tap_1.service.IStudentService;
import bai_tap_1.service.impl.StudentService;

import java.util.Scanner;

public class StudentManagement  {
    private static final IStudentService iStudentService=new StudentService();
    private static Scanner scanner = new Scanner(System.in);
    public static void studentMenu() {
        do {
            System.out.println("1. Them vao hoc sinh.");
            System.out.println("2. Xoa hoc sinh.");
            System.out.println("3. Hien thi danh sach hoc sinh.");
            System.out.println("4. Quay lai.");
            System.out.println("Nhap vao lua chon: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    iStudentService.add();
                    break;
                }
                case 2: {
                    System.out.println("Nhap vao hoc sinh co id can xoa: ");
                    String id=scanner.nextLine();
                    iStudentService.remove(id);
                    break;
                }
                case 3: {
                    iStudentService.display();
                    break;
                }
                case 4: {
                    return;
                }
            }
        }while (true);
    }
}

