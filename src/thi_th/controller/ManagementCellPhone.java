package thi_th.controller;

import thi_th.service.CellPhoneService;
import thi_th.service.ICellPhoneService;

import java.util.Scanner;

public class ManagementCellPhone {
    public void CellPhoneMenu(){
     Scanner scanner = new Scanner(System.in);
        ICellPhoneService iCellPhoneService = new CellPhoneService();
        do {
            System.out.println("1.Them moi");
            System.out.println("2.Xoa");
            System.out.println("3.Xem dien thoai");
            System.out.println("4.Tim kiem");
            System.out.println("5. Thoat");
            System.out.println("Tim kiem chuc nang: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: {
                    iCellPhoneService.addCellPhone();
                    break;
                }
                case 2:{
                    System.out.println("Nhap vao id can xoa: ");
                    int id=Integer.parseInt(scanner.nextLine());
                    iCellPhoneService.removeCellPhone(id);
                    break;
                }
                case 3:{
                    iCellPhoneService.displayCellPhone();
                    break;
                }
                case 4:{
                    System.out.println("Nhap vao id can tim kiem: ");
                    int id=Integer.parseInt(scanner.nextLine());
                    iCellPhoneService.searchCellPhone(id);
                    break;
                }
                case 5:{
                    return;
                }
            }

        }while (true);
    }
}
