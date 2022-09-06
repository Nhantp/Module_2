package bai_tap_1.controller;

import bai_tap_1.service.ITeacherService;
import bai_tap_1.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherManagement {
    private static ITeacherService iTeacherService= new TeacherService();
    private static Scanner scanner=new Scanner(System.in);
    public static void teacherMenu() {
        do {
            System.out.println("1.Them giang vien");
            System.out.println("2.Xoa giang vien");
            System.out.println("3.Hien thi giang vien");
            System.out.println("4.Quay lai");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:{
                    iTeacherService.add();
                    break;
                }
                case 2:{
                    iTeacherService.remove();
                    break;
                }
                case 3:{
                    iTeacherService.display();
                    break;
                }
                case 4:{
                    return;
                }


            }
        } while (true);
    }
}
