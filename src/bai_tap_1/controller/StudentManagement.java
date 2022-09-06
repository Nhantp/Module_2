package bai_tap_1.controller;

import bai_tap_1.service.impl.StudentService;

import java.util.Scanner;

public class StudentManagement  {
    public void studentMenu() {
        StudentService studentService = new StudentService();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1. Them vao hoc sinh.");
            System.out.println("2. Xoa hoc sinh.");
            System.out.println("3. Hien thi danh sach hoc sinh.");
            System.out.println("4. Quay lai.");
            System.out.println("Nhap vao lua chon: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1: {
                    studentService.add();
                    break;
                }
                case 2: {
                    studentService.remove();
                    break;
                }
                case 3: {
                    studentService.display();
                    break;
                }
                case 4: {
                    return;
                }
            }
        }while (true);
    }
}

