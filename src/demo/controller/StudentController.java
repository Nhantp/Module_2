package demo.controller;

import demo.service.IStudentService;
import demo.service.impl.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    //DI
    private static IStudentService iStudentService = new StudentService();
    private static Scanner scanner = new Scanner(System.in);
    public static void menuStudent() {
        while (true) {
            System.out.println("Quản lý học sinh.");
            System.out.println("1. Thêm mới học sinh");
            System.out.println("2. Hiển thị danh sách học sinh");
            System.out.println("3. Xóa học sinh");
            System.out.println("4. Tìm kiếm học sinh");
            System.out.println("5. Quay về menu chính");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iStudentService.addStudent();
                    System.out.println("Thêm mới thành công.");
                    break;
                case 2:
                    iStudentService.display();
                    break;
                case 5:
                    return;
            }
        }
    }
}
