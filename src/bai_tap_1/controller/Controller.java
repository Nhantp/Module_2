package bai_tap_1.controller;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        do {
        System.out.println("1.Hoc sinh.\n" + "2.Giang vien\n" + "3.Thoát");
            System.out.println("Nhap vao lua chon: ");
            Scanner input = new Scanner(System.in);
            int check = input.nextInt();
            switch (check){
                case 1:{
                    StudentManagement.studentMenu();
                    break;
                }
                case 2:{
                    TeacherManagement.teacherMenu();
                    break;
                }
                case 3:{
                    System.exit(0);
                }
            }

        }while (true);
    }
}
