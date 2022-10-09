package bai_tap_1.controller;

import bai_tap_1.service.ITeacherService;
import bai_tap_1.service.impl.TeacherService;

import java.util.Scanner;

public class TeacherManagement {
    public static void teacherMenu() {
        ITeacherService iTeacherService= new TeacherService();
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("1.Them giang vien");
            System.out.println("2.Xoa giang vien");
            System.out.println("3.Hien thi giang vien");
            System.out.println("4. Sua thong tin giang vien");
            System.out.println("5.Quay lai");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:{
                    iTeacherService.add();
                    break;
                }
                case 2:{
                    System.out.println("Nhap vao giao vien co id can xoa: ");
                    int id=Integer.parseInt(scanner.nextLine());
                    iTeacherService.remove(id);
                    break;
                }
                case 3:{
                    iTeacherService.display();
                    break;
                }
                case 4:{
                    System.out.println("Nhap vao id giang vien can sua:");
                    int id=Integer.parseInt(scanner.nextLine());
                    iTeacherService.edit(id);
                }


            }
        } while (true);
    }
}
