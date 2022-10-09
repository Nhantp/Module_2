package thi_th.controller;

import com.sun.java.browser.plugin2.DOM;

import java.util.Scanner;

public class ManagementMobile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ManagementGenuinePhone managementGenuinePhone=new ManagementGenuinePhone();
        ManagementCellPhone managementCellPhone=new ManagementCellPhone();
        System.out.println("--CHUONG TRINH QUAN LY DIEN THOAI--");
        do {
            System.out.println("1.Dien thoai chinh hang.");
            System.out.println("2.Dien thoai xach tay.");
            System.out.println("3.Thoat");
            System.out.println("Nhap vao lua chon: ");
            int choice=Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:{
                    managementGenuinePhone.GenuinePhoneMenu();;
                    break;
                }
                case 2: {
                    managementCellPhone.CellPhoneMenu();
                    break;
                }
                case 3:{
                    System.exit(0);
                }
            }
        }while (true);
    }
}
